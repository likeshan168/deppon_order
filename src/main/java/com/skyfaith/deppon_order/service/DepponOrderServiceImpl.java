package com.skyfaith.deppon_order.service;

import com.deppon.dop.module.sdk.shared.domain.order.OrderInfo;
import com.deppon.dop.module.sdk.shared.util.FastJsonUtil;
import com.deppon.dop.module.sdk.shared.util.HttpUtils;
import com.deppon.dop.module.sdk.shared.util.SecurityUtil;
import com.skyfaith.deppon_order.entity.ConfigBean;
import com.skyfaith.deppon_order.entity.DepponOrderResponse;
import org.apache.commons.httpclient.NameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service("depponOrderService")
public class DepponOrderServiceImpl implements DepponOrderService {
    @Autowired
    private ConfigBean configBean;

    public DepponOrderResponse addOrder(OrderInfo orderInfo) {
        String params = FastJsonUtil.toJSONString(orderInfo);

//        String companyCode = "EWBBJQHGJHYDLYXGSHNFGS";
//        String appkey = "688a2dd37e1ee837a72eb53005ca4873";
//        String url = "http://dpsanbox.deppon.com/sandbox-web/standard-order/saveOrder.action";

        String timestamp = SecurityUtil.getTimestamp();
        String digest = SecurityUtil.getDigest(params + configBean.getAppkey() + timestamp);

        NameValuePair[] data = new NameValuePair[4];
        data[0]= new NameValuePair("companyCode", configBean.getCompanyCode());
        data[1] = new NameValuePair("digest", digest);
        data[2] = new NameValuePair("timestamp", timestamp);
        data[3] = new NameValuePair("params", params);


        String response = "";
        try{
            response=HttpUtils.sendRequest(configBean.getUrl(), data, "UTF-8", 5000);
        }catch (IOException e){
            e.printStackTrace();
        }

        return FastJsonUtil.parseObject(response, DepponOrderResponse.class);

    }
}

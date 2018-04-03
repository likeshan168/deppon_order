package com.skyfaith.deppon_order.controller;

import com.deppon.dop.module.sdk.shared.domain.order.OrderInfo;
import com.skyfaith.deppon_order.entity.DepponOrderResponse;
import com.skyfaith.deppon_order.service.DepponOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/deppon")
public class DepponOrderController {
    @Resource
    private DepponOrderService depponOrderService;

    @RequestMapping(value = "/createorder", method = RequestMethod.POST)
//    @ResponseBody
    public DepponOrderResponse CreateOrder(@RequestBody OrderInfo orderInfo){
        return depponOrderService.addOrder(orderInfo);
    }
}

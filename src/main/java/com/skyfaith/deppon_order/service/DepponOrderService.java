package com.skyfaith.deppon_order.service;

import com.deppon.dop.module.sdk.shared.domain.order.OrderInfo;
import com.skyfaith.deppon_order.entity.DepponOrderResponse;

public interface DepponOrderService {
    public DepponOrderResponse addOrder(OrderInfo orderInfo);
}

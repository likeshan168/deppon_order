package com.skyfaith.deppon_order.service;

import com.skyfaith.deppon_order.entity.User;

public interface UserService {
    public User getUerById(int userid);
    boolean addUser(User record);
}

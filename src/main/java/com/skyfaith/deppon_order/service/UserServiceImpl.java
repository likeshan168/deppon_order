package com.skyfaith.deppon_order.service;

import com.skyfaith.deppon_order.dao.UserMapper;
import com.skyfaith.deppon_order.entity.User;
import org.dom4j.util.UserDataDocumentFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;

    public User getUerById(int userid) {
        return userDao.selectByPrimaryKey(userid);
    }

    public boolean addUser(User record) {
        boolean result = false;
        try{
            userDao.insertSelective(record);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}

package com.icoffee.provide.service.impl;

import com.icoffee.api.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Name UserServiceImpl
 * @Description
 * @Author huangyingfeng
 * @Create 2021-07-29 19:38
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String getUser(String username) {
        return "Hi," + username + "!";
    }
}

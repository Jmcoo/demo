package com.jmc.service.impl;

import com.jmc.mapper.ILoginMapper;
import com.jmc.pojo.Login;
import com.jmc.service.ILoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

    @Resource
    private ILoginMapper loginMapper;

    @Override
    public Login validateLogin(String id, String password) {
        return loginMapper.validateLogin(id,password);
    }
}

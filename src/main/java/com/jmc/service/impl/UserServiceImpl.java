package com.jmc.service.impl;

import com.jmc.mapper.ILoginMapper;
import com.jmc.mapper.IUserMapper;
import com.jmc.pojo.User;
import com.jmc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserMapper iUserMapper;

    @Override
    public User queryUser(String id) {
        return iUserMapper.queryUser(id);
    }
}

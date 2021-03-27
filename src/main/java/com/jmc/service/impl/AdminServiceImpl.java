package com.jmc.service.impl;

import com.jmc.mapper.IAdminMapper;
import com.jmc.pojo.Admin;
import com.jmc.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
    @Resource
    private IAdminMapper iAdminMapper;

    @Override
    public Admin queryAdmin(String id) {
        return iAdminMapper.queryAdmin(id);
    }
}

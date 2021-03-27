package com.jmc.mapper;

import com.jmc.pojo.Login;
import org.apache.ibatis.annotations.Param;

public interface ILoginMapper {
    //根据id pwd查询登录表返回login
    Login validateLogin(@Param("id") String id,@Param("password") String password);
}

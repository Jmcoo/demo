package com.jmc.mapper;

import com.jmc.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    //根据id查询user
    User queryUser(@Param("id") String id);
}

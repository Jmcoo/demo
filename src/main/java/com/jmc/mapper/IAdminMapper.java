package com.jmc.mapper;

import com.jmc.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface IAdminMapper {
    //根据id查询Admin
    Admin queryAdmin(@Param("id") String id);
}

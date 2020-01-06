package com.cn.quickbuyserver.mapper;

import com.cn.quickbuyserver.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public
interface UserMapper {
    @Select("select * from User where id = #{id}")
    User findUserById(@Param(value = "id") int id);

}

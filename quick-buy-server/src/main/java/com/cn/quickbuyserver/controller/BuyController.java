package com.cn.quickbuyserver.controller;

import com.alibaba.fastjson.JSON;
import com.cn.quickbuyserver.mapper.UserMapper;
import com.cn.quickbuyserver.model.User;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public
class BuyController {

    @Autowired
    private
    UserMapper userMapper;


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/findAllUser/{id}")
    public
    String findAllUser(@PathVariable("id") int id){
        User user = userMapper.findUserById(id);
        String userJson = JSON.toJSONString(user);
        return userJson;
    }

}

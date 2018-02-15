package com.zsc.controller;

import com.zsc.feign.FeignUserClient;
import com.zsc.feign.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/15.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private FeignUserClient feignUserClient;

    @RequestMapping("/getUser")
    public User getUser(){
        return feignUserClient.getUserById("1");
    }
}

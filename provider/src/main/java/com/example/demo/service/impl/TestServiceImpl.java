package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String msg){
        return "hello " + msg;
    }
}

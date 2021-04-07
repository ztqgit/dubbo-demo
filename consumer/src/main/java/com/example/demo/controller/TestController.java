package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @DubboReference(version = "1.0.0", registry = "${dubbo.registry.address}" )
    TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String index(String msg){
        return testService.sayHello(msg);
    }
}

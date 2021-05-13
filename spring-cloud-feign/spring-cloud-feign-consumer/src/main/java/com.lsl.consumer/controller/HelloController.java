package com.lsl.consumer.controller;

import com.lsl.consumer.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    TestService testService;

    @GetMapping("/")
    public String hello(){
        return testService.test();
    }
}

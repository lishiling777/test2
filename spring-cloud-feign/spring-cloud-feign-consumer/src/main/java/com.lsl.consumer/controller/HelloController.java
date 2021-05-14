package com.lsl.consumer.controller;

import com.lsl.consumer.common.request.UserRequestParams;
import com.lsl.consumer.common.response.ResponseVo;
import com.lsl.consumer.common.vo.UserVo;
import com.lsl.consumer.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    TestService testService;

    @GetMapping("/")
    public ResponseVo<String> hello(){
        return  testService.test();
    }

    @GetMapping("/user")
    public ResponseVo<UserVo> showUser(int id, String name){
        return testService.list(id,name);
    }

    @GetMapping("/register")
    public ResponseVo<UserVo> register(UserRequestParams userRequestParams){
        return testService.register(userRequestParams);
    }

    @GetMapping("/test")
    public ResponseVo<Integer> test2(){
        return testService.test2();
    }

    @GetMapping("/detail/{id}")
    public ResponseVo<UserVo> detail(@PathVariable Integer id){
        return testService.detail(id);
    }
}

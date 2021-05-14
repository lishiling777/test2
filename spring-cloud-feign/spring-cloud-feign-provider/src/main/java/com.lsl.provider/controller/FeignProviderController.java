package com.lsl.provider.controller;

import com.lsl.provider.common.request.UserRequestParams;
import com.lsl.provider.common.response.ResponseVo;
import com.lsl.provider.common.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
public class FeignProviderController {

    @Value(value = "${server.port}")
    int port;


    @GetMapping("/pro")
    public ResponseVo<String> getData(){
        return ResponseVo.success("hello");
    }

    @GetMapping("/list")
    public ResponseVo<UserVo> getUser(int id, String name){
        UserVo userVo = new UserVo();
        userVo.setName("admin");
        userVo.setId(1);
        return ResponseVo.success(userVo);
    }

    @PostMapping("/register")
    public ResponseVo<UserVo> register(@RequestBody UserRequestParams userRequestParams){
        UserVo userVo = new UserVo();
        userVo.setName("user");
        userVo.setId(2);
        return ResponseVo.success(userVo);
    }

    @GetMapping("/detail/{id}")
    public ResponseVo<UserVo> detail(@PathVariable Integer id) {
        log.info("用户ID: {}", id);
        UserVo userVo = new UserVo();
        userVo.setId(3);
        userVo.setName("动态路径");
        return ResponseVo.success(userVo);
    }

    @GetMapping("/test")
    public ResponseVo<Integer> test2() {
        return ResponseVo.success(port);
    }


}

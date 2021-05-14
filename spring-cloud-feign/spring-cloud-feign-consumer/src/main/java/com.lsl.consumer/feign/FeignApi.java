package com.lsl.consumer.feign;


import com.lsl.consumer.common.request.UserRequestParams;
import com.lsl.consumer.common.response.ResponseVo;
import com.lsl.consumer.common.vo.UserVo;
import com.lsl.consumer.feign.fallback.UserFeginFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "spring-cloud-feign-provider",path = "/user", fallback = UserFeginFallBack.class)
public interface FeignApi {
    @GetMapping("/pro")
    ResponseVo<String> getData();

    @GetMapping("/list")
    ResponseVo<UserVo> getUser(@RequestParam int id, @RequestParam String name);

    @PostMapping("/register")
    ResponseVo<UserVo> register(@RequestBody UserRequestParams userRequestParams);

    @GetMapping("/test")
    ResponseVo<Integer> test2();

    @GetMapping("/detail/{id}")
    ResponseVo<UserVo> detail(@PathVariable Integer id);
}

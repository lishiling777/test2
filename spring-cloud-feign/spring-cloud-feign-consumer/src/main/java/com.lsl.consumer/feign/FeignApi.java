package com.lsl.consumer.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-cloud-feign-provider",path = "/user")
public interface FeignApi {
    @GetMapping("/pro")
    String getData();
}

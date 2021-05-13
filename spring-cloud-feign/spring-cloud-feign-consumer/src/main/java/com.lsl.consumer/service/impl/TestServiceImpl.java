package com.lsl.consumer.service.impl;

import com.lsl.consumer.feign.FeignApi;
import com.lsl.consumer.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    FeignApi feignApi;

    @Override
    public String test() {
        return feignApi.getData();
    }
}

package com.lsl.consumer.service.impl;

import com.lsl.consumer.common.request.UserRequestParams;
import com.lsl.consumer.common.response.ResponseVo;
import com.lsl.consumer.common.vo.UserVo;
import com.lsl.consumer.feign.FeignApi;
import com.lsl.consumer.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    FeignApi feignApi;

    @Override
    public ResponseVo<String> test() {
        return feignApi.getData();
    }

    @Override
    public ResponseVo<UserVo> list(int id, String name) {
        return feignApi.getUser(id,name);
    }

    @Override
    public ResponseVo<UserVo> register(UserRequestParams userRequestParams) {
        return feignApi.register(userRequestParams);
    }

    @Override
    public ResponseVo<Integer> test2() {
        return feignApi.test2();
    }

    @Override
    public ResponseVo<UserVo> detail(Integer id) {
        return feignApi.detail(id);
    }
}

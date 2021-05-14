package com.lsl.consumer.service;

import com.lsl.consumer.common.request.UserRequestParams;
import com.lsl.consumer.common.response.ResponseVo;
import com.lsl.consumer.common.vo.UserVo;

public interface TestService {
    ResponseVo<String> test();

    ResponseVo<UserVo> list(int id, String name);

    ResponseVo<UserVo> register(UserRequestParams userRequestParams);

    ResponseVo<Integer> test2();

    ResponseVo<UserVo> detail(Integer id);
}

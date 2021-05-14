package com.lsl.consumer.feign.fallback;

import com.lsl.consumer.common.request.UserRequestParams;
import com.lsl.consumer.common.response.ResponseVo;
import com.lsl.consumer.common.vo.UserVo;
import com.lsl.consumer.feign.FeignApi;

public class UserFeginFallBack implements FeignApi {
    @Override
    public ResponseVo<String> getData() {
        return ResponseVo.success(null);
    }

    @Override
    public ResponseVo<UserVo> getUser(int id, String name) {
        return ResponseVo.success(null);
    }

    @Override
    public ResponseVo<UserVo> register(UserRequestParams userRequestParams) {
        return ResponseVo.success(null);
    }

    @Override
    public ResponseVo<Integer> test2() {
        return ResponseVo.success(0);
    }

    @Override
    public ResponseVo<UserVo> detail(Integer id) {
        return ResponseVo.success(null);
    }
}

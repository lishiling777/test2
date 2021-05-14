package com.lsl.provider.common.response;


import lombok.Data;

@Data
public class ResponseVo<T> {

    private int status;
    private String msg;
    private T data;

    public static <T> ResponseVo<T> success(T data){
        ResponseVo<T> responseVo = new ResponseVo<>();
        responseVo.setMsg("success");
        responseVo.setData(data);
        responseVo.setStatus(200);
        return responseVo;
    }
}

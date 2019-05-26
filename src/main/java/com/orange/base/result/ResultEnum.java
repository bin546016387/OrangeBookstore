package com.orange.base.result;

public enum ResultEnum {

    SUCCESS(200),

    FAILURE(400),

    // 未认证（签名错误）
    UNAUTHORIZED(401),

    NOT_FOUND(404),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultEnum (int code){
        this.code = code;
    }
}

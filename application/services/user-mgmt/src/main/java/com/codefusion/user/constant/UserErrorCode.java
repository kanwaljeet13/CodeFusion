package com.codefusion.user.constant;

import com.codefusion.exceptions.constant.CodeFusionErrorCode;

public enum UserErrorCode implements CodeFusionErrorCode {
    USER_NOT_FOUND_BY_NAME("ERR_USER_0001", "User with id %s not found"),
    ;

    private String code;
    private String message;

    UserErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

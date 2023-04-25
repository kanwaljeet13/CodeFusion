package com.codefusion.exceptions.constant;

public enum CommonErrorCode implements CodeFusionErrorCode{
    GENERAL_ERROR("ERR_COMM_0001", "General Error"),
    ;

    private String code;
    private String message;

    CommonErrorCode(String code, String message) {
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

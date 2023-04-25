package com.codefusion.exceptions;

import com.codefusion.exceptions.constant.CodeFusionErrorCode;
import com.codefusion.exceptions.constant.CommonErrorCode;
import lombok.Data;

@Data
public abstract class CodeFusionException extends RuntimeException {

    private final String trackingId;
    private final String errorCode;

    protected CodeFusionException(CodeFusionErrorCode errorCode, String trackingId) {
        super(errorCode.getMessage());
        this.errorCode = errorCode.getCode();
        this.trackingId = trackingId;
    }

    protected CodeFusionException(Exception e, String trackingId) {
        super(e);
        this.errorCode = CommonErrorCode.GENERAL_ERROR.getCode();
        this.trackingId = trackingId;
    }
}

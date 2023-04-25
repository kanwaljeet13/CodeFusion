package com.codefusion.exceptions;

import com.codefusion.exceptions.constant.CodeFusionErrorCode;

public abstract class ResourceNotFoundException extends CodeFusionException {

    protected ResourceNotFoundException(CodeFusionErrorCode errorCode, String trackingId) {
        super(errorCode, trackingId);
    }
}

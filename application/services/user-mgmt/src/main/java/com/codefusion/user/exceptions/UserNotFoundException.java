package com.codefusion.user.exceptions;

import com.codefusion.exceptions.CodeFusionException;
import com.codefusion.exceptions.constant.CommonErrorCode;
import com.codefusion.user.constant.UserErrorCode;

public class UserNotFoundException extends CodeFusionException {

    private final long id;
    public UserNotFoundException(long id, String trackingId) {
        super(UserErrorCode.USER_NOT_FOUND_BY_NAME, trackingId);
        this.id = id;
    }
}

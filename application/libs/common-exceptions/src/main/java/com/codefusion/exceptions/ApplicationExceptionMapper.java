package com.codefusion.exceptions;

import com.codefusion.exceptions.constant.CommonErrorCode;
import com.codefusion.exceptions.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ApplicationExceptionMapper {

    @ExceptionHandler(value = { Throwable.class })
    protected ResponseEntity<ErrorResponseDto> handleConflict(Exception ex, WebRequest request) {
        return new ResponseEntity<>(new ErrorResponseDto(CommonErrorCode.GENERAL_ERROR.getCode(), ex.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = { CodeFusionException.class })
    protected ResponseEntity<ErrorResponseDto> handleConflict(CodeFusionException ex, WebRequest request) {
        return new ResponseEntity<>(new ErrorResponseDto(ex.getErrorCode(), ex.getMessage(),
                ex.getTrackingId()), HttpStatus.BAD_REQUEST);
    }
}

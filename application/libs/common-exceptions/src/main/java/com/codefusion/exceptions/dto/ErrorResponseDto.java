package com.codefusion.exceptions.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class ErrorResponseDto {

    private String errorCode;
    private String message;
    private String trackingId;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public ErrorResponseDto(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public ErrorResponseDto(String errorCode, String message, String trackingId) {
        this.errorCode = errorCode;
        this.message = message;
        this.trackingId = trackingId;
    }
}

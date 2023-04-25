package com.codefusion.user.service;

import com.codefusion.user.model.dto.request.UserRequestDto;
import com.codefusion.user.model.dto.response.UserResponseDto;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUser(String trackingUuid, long id);
}

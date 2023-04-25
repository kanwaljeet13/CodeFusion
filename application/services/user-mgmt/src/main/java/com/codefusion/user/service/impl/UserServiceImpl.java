package com.codefusion.user.service.impl;

import com.codefusion.user.exceptions.UserNotFoundException;
import com.codefusion.security.model.entity.User;
import com.codefusion.security.repository.UserRepository;
import com.codefusion.user.service.UserService;
import com.codefusion.user.model.dto.request.UserRequestDto;
import com.codefusion.user.model.dto.response.UserResponseDto;
import com.codefusion.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = userRepository.save(UserMapper.toUser(userRequestDto));
        return UserMapper.toUserDto(user);
    }

    @Override
    public UserResponseDto getUser(String trackingUuid, long id) {
        return userRepository.findById(id).map(UserMapper::toUserDto).orElseThrow(
                () -> new UserNotFoundException(id, trackingUuid));
    }
}

package com.codefusion.user.controller;

import com.codefusion.security.constant.Headers;
import com.codefusion.user.model.dto.request.UserRequestDto;
import com.codefusion.user.model.dto.response.UserResponseDto;
import com.codefusion.user.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    
    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<UserResponseDto> addUser(@RequestBody UserRequestDto requestBody) {
        return ResponseEntity.ok(userService.createUser(requestBody));
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_USER', 'ROLE_ADMIN')")
    public ResponseEntity<UserResponseDto> getUser(HttpServletRequest request, @PathVariable long id) {
        String trackingUuid = request.getHeader(Headers.TRACKING_UUID);
        return ResponseEntity.ok(userService.getUser(trackingUuid, id));
    }
}

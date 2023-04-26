package com.codefusion.auth.controller;

import com.codefusion.auth.model.dto.request.UserCredentialRequestDto;
import com.codefusion.auth.model.dto.response.UserAuthenticationResponse;
import com.codefusion.auth.service.AuthenticationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/login")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @ResponseStatus(OK)
    @PostMapping()
    public UserAuthenticationResponse login(@RequestBody UserCredentialRequestDto userCredentialRequestDto) {
        return authenticationService.login(userCredentialRequestDto);
    }
}

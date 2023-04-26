package com.codefusion.auth.service;

import com.codefusion.auth.model.dto.request.UserCredentialRequestDto;
import com.codefusion.auth.model.dto.response.UserAuthenticationResponse;

public interface AuthenticationService {

    UserAuthenticationResponse login(UserCredentialRequestDto userCredentialRequestDto);
}

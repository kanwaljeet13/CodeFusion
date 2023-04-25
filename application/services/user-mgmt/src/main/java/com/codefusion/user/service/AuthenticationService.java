package com.codefusion.user.service;

import com.codefusion.user.model.dto.request.UserCredentialRequestDto;
import com.codefusion.user.model.dto.response.UserAuthenticationResponse;

public interface AuthenticationService {

    UserAuthenticationResponse login(UserCredentialRequestDto userCredentialRequestDto);
}

package com.financial.trak.service;

import com.financial.trak.dto.request.UserRequest;
import com.financial.trak.dto.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse signup(UserRequest request);
    UserResponse login(UserRequest loginRequest);
}

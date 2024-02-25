package com.financial.trak.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private String username;
    private String password;
    private String message;
    private String token;
}

package com.example.demo.dto.response;

import com.example.demo.dto.response.JwtResponse;
import java.time.Instant;

import org.springframework.http.HttpStatus;
public sealed interface AuthResponse 
    permits JwtResponse, TokenRefreshResponse, ErrorResponse, OAuth2Response {
    
    String message();
    Instant timestamp();
    HttpStatus status();
}

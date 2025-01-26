package com.example.demo.dto.response;

import java.time.Instant;

import org.springframework.http.HttpStatus;

public record TokenRefreshResponse(
    String newAccessToken,
        String refreshToken
    ) implements AuthResponse {
    @Override public String message() { return "Token refreshed"; }
    @Override public Instant timestamp() { return Instant.now(); }
    @Override public HttpStatus status() { return HttpStatus.OK; }
}

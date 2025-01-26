package com.example.demo.dto.response;

import java.time.Instant;

import org.springframework.http.HttpStatus;

public record JwtResponse(
    String accessToken,
    String refreshToken,
    String tokenType,
    Instant expiresAt
) implements AuthResponse {
    @Override public String message() { return "Authentication successful"; }
    @Override public Instant timestamp() { return Instant.now(); }
    @Override public HttpStatus status() { return HttpStatus.OK; }
}
package com.example.demo.dto.response;

import org.springframework.http.HttpStatus;
import java.time.Instant;

public record ErrorResponse(
    String message,
    HttpStatus status,  // Changed from int to HttpStatus
    Instant timestamp
) implements AuthResponse {

    // Auto-implemented interface methods
    @Override public String message() { return message; }
    @Override public HttpStatus status() { return status; }
    @Override public Instant timestamp() { return timestamp; }

    // Additional factory method for convenience
    public static ErrorResponse of(String message, HttpStatus status) {
        return new ErrorResponse(message, status, Instant.now());
    }
}

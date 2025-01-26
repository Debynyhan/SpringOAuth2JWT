package com.example.demo.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public record SignupRequest(
    @Email String email, 
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d).{8,}$") String password
    
) {
    
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Implement your login logic here
        return "Login successful";
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest registerRequest) {
        // Implement your registration logic here
        return "Registration successful";
    }

    // Define LoginRequest and RegisterRequest classes or use existing ones
    public static class LoginRequest {
        private String username;
        private String password;

        // Getters and setters
    }

    public static class RegisterRequest {
        private String username;
        private String password;
        private String email;

        // Getters and setters
    }
}
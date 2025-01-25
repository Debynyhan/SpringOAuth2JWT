package com.example.demo.service;

import com.example.demo.dto.response.*;
import com.example.demo.dto.request.*;

public interface AuthService {
    JwtResponse signup(SignupRequest request);
    JwtResponse login(LoginRequest request);
    JwtResponse refreshToken(String refreshToken);
    void logout(String refreshToken);
}
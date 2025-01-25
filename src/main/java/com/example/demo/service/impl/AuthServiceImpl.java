package com.example.demo.service.impl;

import com.example.demo.utils.JwtUtils;
import com.example.demo.service.RefreshTokenService;

import com.example.demo.dto.response.JwtResponse;
import com.example.demo.dto.request.SignupRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;

import com.example.demo.dto.request.LoginRequest;
import lombok.RequiredArgsConstructor;
import com.example.demo.service.AuthService;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;
    private final RefreshTokenService refreshTokenService;

    @Override
    public JwtResponse signup(SignupRequest request) {
        return null;
    }
    
    @Override
    public JwtResponse login(LoginRequest request) {
        return null;
    }

    @Override
    public JwtResponse refreshToken(String refreshToken) {
        return null;
    }
    @Override
    public void logout(String refreshToken) {
    }
    
}

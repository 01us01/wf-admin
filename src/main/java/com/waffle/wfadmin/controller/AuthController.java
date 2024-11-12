package com.waffle.wfadmin.controller;

import com.waffle.wfadmin.config.JwtTokenProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtTokenProvider jwtTokenProvider;

    public AuthController(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String userId, @RequestParam String password) {
        // 사용자 인증 로직 (예: DB에서 사용자 조회 및 비밀번호 검증)
        if ("testUser".equals(userId) && "password".equals(password)) { // 예제용 코드
            String token = jwtTokenProvider.createToken(userId);
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
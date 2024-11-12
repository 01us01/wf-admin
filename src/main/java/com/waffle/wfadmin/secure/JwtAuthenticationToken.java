package com.waffle.wfadmin.secure;

import org.springframework.security.authentication.AbstractAuthenticationToken;

public class JwtAuthenticationToken extends AbstractAuthenticationToken {

    private final String userId;

    public JwtAuthenticationToken(String userId) {
        super(null);
        this.userId = userId;
        setAuthenticated(true); // 이 토큰이 이미 인증되었음을 표시합니다.
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}

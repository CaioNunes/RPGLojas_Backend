package com.rpglojas.controller.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {

    private String token;
    private String type = "Bearer ";

    public JwtResponse(String token) {
        super();
        this.token = token;
    }
}
package com.rpglojas.enums.security;

public enum RoleName {

    ROLE_JOGADOR("jogador"),
    ROLE_MESTRE("mestre"),
    ROLE_ADMIN("admin");

    private String descricao;

    RoleName(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

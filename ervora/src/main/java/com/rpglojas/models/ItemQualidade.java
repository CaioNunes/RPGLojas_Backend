package com.rpglojas.models;

import javax.persistence.*;

@Entity
@Table(name = "ITEM_QUALIDADE")
public class ItemQualidade {

    @Id
    @GeneratedValue
    @Column(name = "id_item_qualidade")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

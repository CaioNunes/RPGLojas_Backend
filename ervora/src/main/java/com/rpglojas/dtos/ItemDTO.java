package com.rpglojas.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class ItemDTO {

    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;

    @NotNull
    private ItemQualidadeDTO qualidadeItem;

    @NotNull
    private ItemTipoDTO tipoItem;

    @NotNull
    @Min(1)
    @Max(999)
    private BigDecimal precoBase;

    @NotNull
    @Min(0)
    @Max(999)
    private BigDecimal peso;
}

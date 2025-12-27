package com.estudo.finance.dtos.conta;

import com.estudo.finance.domain.conta.ContaEntity;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ContaDTO(
        @NotBlank
        Long tipoConta,

        @NotBlank
        Long idBanco,

        @NotBlank
        Long idUsuario,

        Long numero,
        BigDecimal saldo
) {
    public ContaEntity toEntity() {
        return ContaEntity.builder()
                .saldo(saldo != null ? saldo  : BigDecimal.ZERO)
                .build();
    }
}

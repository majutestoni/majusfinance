package com.estudo.finance.dtos.movimento.entrada;

import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DTO que representa a movimentação financeira do tipo entrada
 *
 * @author Majú Testoni
 */
public record EntradaDTO(
        @NotNull @DecimalMin("0.01")
        BigDecimal valor,
        @NotBlank
        String codigoAtivo,
        @Size(max = 200)
        String descricao,
        @NotBlank
        Long idAtivo,
        @NotNull
        Long idConta,
        @NotNull
        Long idCategoria,
        @NotNull
        Long idSubCategoria,

        LocalDateTime data
) {

    public EntradaEntity toEntity() {
        return EntradaEntity.builder()
                .valor(valor)
                .data(data)
                .descricao(descricao)
                .build();
    }
}

package com.estudo.finance.dtos.movimento.saida;

import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SaidaDTO(
        @NotBlank
        Long tipoMeioSaida,
        @NotNull @DecimalMin("0.01")
        BigDecimal valor,
        @Size(max = 200)
        String descricao,
        @NotNull
        Long idConta,
        @NotNull
        Long idCategoria,
        @NotNull
        Long idSubCategoria,

        LocalDateTime data
) {

    public SaidaEntity toEntity() {
        return SaidaEntity.builder()
                .valor(valor)
                .descricao(descricao)
                .data(data)
                .build();
    }
}

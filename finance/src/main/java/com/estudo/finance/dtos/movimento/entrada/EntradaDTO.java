package com.estudo.finance.dtos.movimento.entrada;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * DTO que representa a movimentação financeira do tipo entrada
 *
 * @author Majú Testoni
 */
public record EntradaDTO(

		@NotBlank(message = "O código do ativo é obrigatório")
		String codigoAtivo,

		@NotNull(message = "O valor é obrigatório")
		@DecimalMin(value = "0.01", inclusive = true, message = "O valor deve ser maior que zero")
		BigDecimal valor,

		@Size(max = 200, message = "A descrição não pode ultrapassar 200 caracteres")
		String descricao,

		LocalDateTime data
		) {
}

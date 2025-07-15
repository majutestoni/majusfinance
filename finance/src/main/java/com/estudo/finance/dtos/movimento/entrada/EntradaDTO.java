package com.estudo.finance.dtos.movimento.entrada;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.estudo.finance.dtos.movimento.DinheiroMovimentoDTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO que representa a movimentação financeira do tipo entrada
 *
 * @author Majú Testoni
 */
public class EntradaDTO extends DinheiroMovimentoDTO {

	@NotBlank(message = "O código do ativo é obrigatório")
	String codigoAtivo;


	public String getCodigoAtivo() {
		return codigoAtivo;
	}

	public void setCodigoAtivo(String codigoAtivo) {
		this.codigoAtivo = codigoAtivo;
	}


}

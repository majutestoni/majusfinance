package com.estudo.finance.dtos.movimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author Majú Testoni
 */
public abstract class DinheiroMovimentoDTO {

	@NotNull(message = "O valor é obrigatório")
	@DecimalMin(value = "0.01", inclusive = true, message = "O valor deve ser maior que zero")
	private BigDecimal valor;

	@Size(max = 200, message = "A descrição não pode ultrapassar 200 caracteres")
	private String descricao;

	private LocalDateTime data;

	private Long idConta;

	private Long numeroConta;

	private Long codigoBanco;

	private Long codigoCategoria;

	private Long codigoSubCategoria;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public Long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Long getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(Long codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
}

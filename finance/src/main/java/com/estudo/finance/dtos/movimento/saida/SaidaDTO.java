package com.estudo.finance.dtos.movimento.saida;

import com.estudo.finance.dtos.movimento.DinheiroMovimentoDTO;

/**
 * @author Majú Testoni
 */
public class SaidaDTO extends DinheiroMovimentoDTO {

	private String formaPagamento;

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}

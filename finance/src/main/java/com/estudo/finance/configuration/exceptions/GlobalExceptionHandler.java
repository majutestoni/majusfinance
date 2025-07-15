package com.estudo.finance.configuration.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Majú Testoni
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RequisicaoInvalidaException.class)
	public ResponseEntity<ErroResposta> handleRequisicaoInvalida(RequisicaoInvalidaException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ErroResposta("Requisição inválida", ex.getMessage()));
	}

	public static class ErroResposta {
		private String erro;
		private String detalhe;

		public ErroResposta(String erro, String detalhe) {
			this.erro = erro;
			this.detalhe = detalhe;
		}

		public String getErro() {
			return erro;
		}

		public String getDetalhe() {
			return detalhe;
		}
	}

}

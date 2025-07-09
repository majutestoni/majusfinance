package com.estudo.finance.controllers.movimento;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.finance.dtos.movimento.entrada.EntradaDTO;
import com.estudo.finance.services.movimento.entrada.EntradaService;

import jakarta.validation.Valid;

/**
 */
@RestController()
public class MovimentoFinanceiroController {

	private final EntradaService entradaService;

	public MovimentoFinanceiroController(EntradaService entradaService) {
		this.entradaService = entradaService;
	}

	public ResponseEntity<Void> deposito(@RequestBody @Valid EntradaDTO dto) {
		entradaService.deposito(dto);
	}
}

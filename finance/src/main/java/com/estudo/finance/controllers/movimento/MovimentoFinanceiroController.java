package com.estudo.finance.controllers.movimento;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import com.estudo.finance.dtos.movimento.entrada.EntradaDTO;
import com.estudo.finance.services.movimento.entrada.EntradaService;

import jakarta.validation.Valid;

/**
 */
@RestController(value = "/movimento")
@AllArgsConstructor
public class MovimentoFinanceiroController {

	private final EntradaService entradaService;

	@PostMapping("/deposito")
	public ResponseEntity<EntradaEntity> deposito(@RequestBody @Valid EntradaDTO dto) {
		EntradaEntity entity = entradaService.deposito(dto);

		return ResponseEntity.ok(entity);
	}
}

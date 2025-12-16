package com.estudo.finance.controllers.movimento;

import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import com.estudo.finance.dtos.movimento.saida.SaidaDTO;
import com.estudo.finance.services.movimento.investimento.SaidaInvestimentoService;
import com.estudo.finance.services.movimento.saida.SaidaService;
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
    private final SaidaService saidaService;
    private final SaidaInvestimentoService saidaInvestimentoService;

	@PostMapping("/deposito")
	public ResponseEntity<EntradaEntity> deposito(@RequestBody @Valid EntradaDTO dto) {
		EntradaEntity entity = entradaService.deposito(dto);

		return ResponseEntity.ok(entity);
	}

    @PostMapping("/saida")
    public ResponseEntity<SaidaEntity> saida(@RequestBody @Valid SaidaDTO dto) {
        SaidaEntity entity = saidaService.saida(dto);

        return ResponseEntity.ok(entity);
    }

    @PostMapping("/investimento")
    public ResponseEntity<SaidaEntity> investimento() {

    }
}

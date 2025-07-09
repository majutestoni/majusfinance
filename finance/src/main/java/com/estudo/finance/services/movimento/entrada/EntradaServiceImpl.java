package com.estudo.finance.services.movimento.entrada;

import org.springframework.stereotype.Service;

import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import com.estudo.finance.dtos.movimento.entrada.EntradaDTO;
import com.estudo.finance.services.movimento.DinheiroMovimentoServiceImpl;

/**
 * Implementação de {@link  EntradaService}
 *
 * @author Majú Testoni
 */
@Service
public class EntradaServiceImpl
		extends DinheiroMovimentoServiceImpl
		implements EntradaService {


	@Override
	public void deposito(EntradaDTO dto) {
		EntradaEntity entity = getEntity(dto);

	}

	private EntradaEntity getEntity(EntradaDTO dto) {
		EntradaEntity entity = new EntradaEntity();

		entity.set
	}
}

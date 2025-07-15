package com.estudo.finance.services.movimento.entrada;

import com.estudo.finance.domain.movimento.entrada.EntradaEntity;
import com.estudo.finance.dtos.movimento.entrada.EntradaDTO;
import com.estudo.finance.services.movimento.DinheiroMovimentoService;

/**
 * Service especializado para movimentações financeira do tipo entrada
 *
 * @author Majú Testoni
 */
public interface EntradaService extends DinheiroMovimentoService {


	EntradaEntity deposito(EntradaDTO dto);
}

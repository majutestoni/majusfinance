package com.estudo.finance.services.movimento.saida;

import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import com.estudo.finance.dtos.movimento.saida.SaidaDTO;
import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import com.estudo.finance.dtos.movimento.saida.SaidaDTO;
import com.estudo.finance.services.movimento.DinheiroMovimentoService;

/**
 * Service especializado para movimentações financeira do tipo saída
 *
 * @author Majú Testoni
 */
public interface SaidaService extends DinheiroMovimentoService {

	SaidaEntity despesa(SaidaDTO dto);
}

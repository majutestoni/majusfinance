package com.estudo.finance.services.movimento.saida;

import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import com.estudo.finance.dtos.movimento.saida.SaidaDTO;
import org.springframework.stereotype.Service;

import com.estudo.finance.services.movimento.DinheiroMovimentoServiceImpl;

/**
 * Implementação de {@link SaidaService}
 *
 * @author Majú Testoni
 */
@Service
public class SaidaServiceImpl
		extends DinheiroMovimentoServiceImpl
		implements SaidaService {

    @Override
    public SaidaEntity saida(SaidaDTO dto) {
        SaidaEntity saidaEntity = dto.toEntity();

        saveEntitys(saidaEntity, dto);

        saidaEntity.setData(buildDate(dto.data()));
        return null;
    }

    private void saveEntitys(SaidaEntity saidaEntity, SaidaDTO dto) {

    }
}

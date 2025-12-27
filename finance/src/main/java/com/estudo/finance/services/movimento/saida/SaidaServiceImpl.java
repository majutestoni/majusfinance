package com.estudo.finance.services.movimento.saida;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.estudo.finance.domain.movimento.saida.SaidaEntity;
import com.estudo.finance.dtos.movimento.saida.SaidaDTO;
import com.estudo.finance.repositories.categoria.CategoriaRepository;
import com.estudo.finance.repositories.categoria.SubCategoriaRepository;
import com.estudo.finance.repositories.conta.ContaRepository;
import com.estudo.finance.services.movimento.DinheiroMovimentoServiceImpl;

/**
 * Implementação de {@link SaidaService}
 *
 * @author Majú Testoni
 */
@Service
public class SaidaServiceImpl
		extends DinheiroMovimentoServiceImpl<SaidaDTO>
		implements SaidaService {

	public SaidaServiceImpl(ContaRepository contaRepository, CategoriaRepository categoriaRepository, SubCategoriaRepository subCategoriaRepository) {
		super(contaRepository, categoriaRepository, subCategoriaRepository);
	}


	@Override
	public SaidaEntity despesa(SaidaDTO dto) {
		return getEntity(dto);
	}

	private SaidaEntity getEntity(SaidaDTO dto) {
		SaidaEntity entity = new SaidaEntity();

		entity.setData(dto.getData() != null ? dto.getData() : LocalDateTime.now());
		entity.setValor(dto.getValor());
		entity.setDescricao(dto.getDescricao());

		entity.setConta(getConta(dto));
	}
}

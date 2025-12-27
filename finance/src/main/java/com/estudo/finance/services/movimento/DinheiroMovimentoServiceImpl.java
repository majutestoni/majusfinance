package com.estudo.finance.services.movimento;

import java.util.Optional;

import com.estudo.finance.configuration.exceptions.RequisicaoInvalidaException;
import com.estudo.finance.domain.categoria.CategoriaMovimentoEntity;
import com.estudo.finance.domain.conta.ContaEntity;
import com.estudo.finance.dtos.movimento.DinheiroMovimentoDTO;
import com.estudo.finance.repositories.banco.BancoRepository;
import com.estudo.finance.repositories.categoria.CategoriaRepository;
import com.estudo.finance.repositories.categoria.SubCategoriaRepository;
import com.estudo.finance.repositories.conta.ContaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Implementção de {@link DinheiroMovimentoService}
 *
 * @author Majú Testoni
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class DinheiroMovimentoServiceImpl implements DinheiroMovimentoService {

	protected ContaRepository contaRepository;
	protected CategoriaRepository categoriaRepository;
	protected SubCategoriaRepository subCategoriaRepository;

	public DinheiroMovimentoServiceImpl(ContaRepository contaRepository, CategoriaRepository categoriaRepository, SubCategoriaRepository subCategoriaRepository) {
		this.contaRepository = contaRepository;
		this.categoriaRepository = categoriaRepository;
		this.subCategoriaRepository = subCategoriaRepository;
	}

	protected ContaEntity getConta(T dto) {
		if (dto.getIdConta() != null) {
			return contaRepository.findById(dto.getIdConta())
					.orElseThrow(() -> new RequisicaoInvalidaException(
							"Conta com ID " + dto.getIdConta() + " não foi encontrada."
					));
		}
		if (dto.getNumeroConta() != null && dto.getCodigoBanco() != null) {
			return contaRepository.getContaByNumeroAndBanco(dto.getNumeroConta(), dto.getCodigoBanco())
					.orElseThrow(() -> new RequisicaoInvalidaException(
							"Conta com número " + dto.getNumeroConta() + " e código do banco " + dto.getCodigoBanco() + " não foi encontrada."
					));
		}
			throw new RequisicaoInvalidaException("Nenhuma informação foi informada");

	}
}

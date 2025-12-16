package com.estudo.finance.services.movimento;

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
    protected BancoRepository bancoRepository;

    protected LocalDateTime buildDate(LocalDateTime dateDTO) {
        if (dateDTO == null) {
            return LocalDateTime.now();
        }

        return dateDTO;
    }

}

package com.estudo.finance.domain.movimento;

import com.estudo.finance.domain.BaseEntity;
import com.estudo.finance.domain.categoria.SubCategoriaMovimentoEntity;
import com.estudo.finance.domain.conta.ContaEntity;

public abstract class DinheiroMovimentoEntity extends BaseEntity {

    private double valor;
    private String descricao;
    private SubCategoriaMovimentoEntity categoria;
    private ContaEntity conta;

}

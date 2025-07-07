package com.estudo.finance.domain.movimento.entrada;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;
import com.estudo.finance.domain.movimento.investimento.AtivoEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "entradas")
@AttributeOverride(name = "id", column = @Column(name = "id_entrada"))
@Getter
@Setter
public class EntradaEntity extends DinheiroMovimentoEntity {

    private AtivoEntity ativo;
}

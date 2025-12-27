package com.estudo.finance.domain.movimento.entrada;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;
import com.estudo.finance.domain.movimento.investimento.AtivoEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "entradas")
@AttributeOverride(name = "id", column = @Column(name = "id_entrada"))
@SuperBuilder
@Getter
@Setter
public class EntradaEntity extends DinheiroMovimentoEntity {

    @ManyToOne
    @JoinColumn(name = "ativo_id_ativo", nullable = false)
    private AtivoEntity ativo;
}

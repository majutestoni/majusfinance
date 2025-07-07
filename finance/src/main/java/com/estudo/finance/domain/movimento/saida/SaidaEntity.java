package com.estudo.finance.domain.movimento.saida;

import com.estudo.finance.domain.movimento.DinheiroMovimentoEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "saidas")
@AttributeOverride(name = "id", column = @Column(name = "id_saida"))
@Getter
@Setter
public class SaidaEntity extends DinheiroMovimentoEntity {

    @Column(name = "tp_meio_saida", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private FormPagamento tipoMeioSaida;

}

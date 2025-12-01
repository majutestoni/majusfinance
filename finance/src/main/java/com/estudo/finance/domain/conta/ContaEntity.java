package com.estudo.finance.domain.conta;

import com.estudo.finance.domain.BaseEntity;
import com.estudo.finance.domain.banco.BancoEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "contas",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"nr_conta", "banco_id_banco"})
        })
@AttributeOverride(name = "id", column = @Column(name = "id_conta"))
@Getter
@Setter
public class ContaEntity extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nr_conta", nullable = false)
    private Long numero;

    @Column(name = "vl_saldo")
    private BigDecimal saldo;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tp_conta", nullable = false)
    private TipoConta tipoConta;

    @ManyToOne
    @JoinColumn(name = "banco_id_banco", nullable = false)
    private BancoEntity banco;
}

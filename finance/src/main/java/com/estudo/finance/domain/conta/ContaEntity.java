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

@Entity
@Table(name = "contas",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"nr_conta", "banco_id_banco"})
        })
@AttributeOverride(name = "id", column = @Column(name = "id_conta"))
public class ContaEntity extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nr_conta", nullable = false)
    private Long numero;

    @Column(name = "vl_saldo")
    private double saldo;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tp_conta", nullable = false)
    private TipoConta tipoConta;

    @ManyToOne
    @JoinColumn(name = "banco_id_banco", nullable = false)
    private BancoEntity banco;

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public BancoEntity getBanco() {
        return banco;
    }

    public void setBanco(BancoEntity banco) {
        this.banco = banco;
    }
}

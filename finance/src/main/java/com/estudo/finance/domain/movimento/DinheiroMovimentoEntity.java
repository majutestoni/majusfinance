package com.estudo.finance.domain.movimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.estudo.finance.domain.BaseEntity;
import com.estudo.finance.domain.categoria.CategoriaMovimentoEntity;
import com.estudo.finance.domain.categoria.SubCategoriaMovimentoEntity;
import com.estudo.finance.domain.conta.ContaEntity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

public abstract class DinheiroMovimentoEntity extends BaseEntity {

    @Column(name = "nr_valor", nullable = false, precision = 19, scale = 2)
    private BigDecimal valor;

    @Column(name = "dt_movimento", nullable = false)
    private LocalDateTime data;

    @Column(name = "ds_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "categoria_id_categoria", nullable = false)
    private CategoriaMovimentoEntity categoriaMovimento;

    @ManyToOne
    @JoinColumn(name = "subcategoria_id_subcategoria", nullable = false)
    private SubCategoriaMovimentoEntity categoria;

    @ManyToOne
    @JoinColumn(name = "conta_id_conta", nullable = false)
    private ContaEntity conta;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public SubCategoriaMovimentoEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(SubCategoriaMovimentoEntity categoria) {
        this.categoria = categoria;
    }

    public ContaEntity getConta() {
        return conta;
    }

    public void setConta(ContaEntity conta) {
        this.conta = conta;
    }

    public CategoriaMovimentoEntity getCategoriaMovimento() {
        return categoriaMovimento;
    }

    public void setCategoriaMovimento(CategoriaMovimentoEntity categoriaMovimento) {
        this.categoriaMovimento = categoriaMovimento;
    }
}

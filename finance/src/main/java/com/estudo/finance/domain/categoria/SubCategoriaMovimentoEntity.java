package com.estudo.finance.domain.categoria;

import com.estudo.finance.domain.BaseEntity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "subcategorias_movimento",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"cd_subcategoria_movimento", "categoria_id_categoria"})
    })
@AttributeOverride(name = "id", column = @Column(name = "id_subcategoria_movimento"))
public class SubCategoriaMovimentoEntity extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_subcategoria_movimento", nullable = false, unique = true)
    private Long codigo;

    @Column(name = "ds_subcategoria_movimento")
    private String denomincao;

    @ManyToOne
    @JoinColumn(name = "categoria_id_categoria", nullable = false)
    private CategoriaMovimentoEntity categoriaMovimento;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDenomincao() {
        return denomincao;
    }

    public void setDenomincao(String denomincao) {
        this.denomincao = denomincao;
    }

    public CategoriaMovimentoEntity getCategoriaMovimento() {
        return categoriaMovimento;
    }

    public void setCategoriaMovimento(CategoriaMovimentoEntity categoriaMovimento) {
        this.categoriaMovimento = categoriaMovimento;
    }
}

package com.estudo.finance.domain.categoria;

import com.estudo.finance.domain.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "categoria_movimento")
public class CategoriaMovimentoEntity extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_categoria_movimento", nullable = false, unique = true)
    private Long codigo;

    @Column(name = "ds_categoria_movimento", nullable = false)
    private String denominacao;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ds_categoria_movimento", nullable = false)
    private TipoMovimento tipo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public TipoMovimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimento tipo) {
        this.tipo = tipo;
    }


}

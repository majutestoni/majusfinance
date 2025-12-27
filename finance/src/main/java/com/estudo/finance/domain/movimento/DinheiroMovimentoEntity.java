package com.estudo.finance.domain.movimento;

import com.estudo.finance.domain.BaseEntity;
import com.estudo.finance.domain.categoria.CategoriaMovimentoEntity;
import com.estudo.finance.domain.categoria.SubCategoriaMovimentoEntity;
import com.estudo.finance.domain.conta.ContaEntity;
import com.estudo.finance.domain.usuario.UsuarioEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "usuario_id_usuario", nullable = false)
    private UsuarioEntity usuario;

}

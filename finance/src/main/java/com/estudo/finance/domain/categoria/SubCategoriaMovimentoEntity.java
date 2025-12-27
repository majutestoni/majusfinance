package com.estudo.finance.domain.categoria;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "subcategorias_movimento",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"cd_subcategoria_movimento", "categoria_id_categoria"})
    })
@AttributeOverride(name = "id", column = @Column(name = "id_subcategoria_movimento"))
@Getter
@Setter
public class SubCategoriaMovimentoEntity extends BaseEntity {

    @Column(name = "cd_categoria_movimento", nullable = false, unique = true, insertable = false,
            updatable = false, columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long codigo;

    @Column(name = "ds_subcategoria_movimento")
    private String denomincao;

    @ManyToOne
    @JoinColumn(name = "categoria_id_categoria", nullable = false)
    private CategoriaMovimentoEntity categoriaMovimento;
}

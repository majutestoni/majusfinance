package com.estudo.finance.domain.categoria;

import com.estudo.finance.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria_movimento")
@Getter
@Setter
@NoArgsConstructor
public class CategoriaMovimentoEntity extends BaseEntity {

    @Column(name = "cd_categoria_movimento", nullable = false, unique = true, insertable = false,
            updatable = false, columnDefinition = "BIGINT AUTO_INCREMENT")
    private Long codigo;

    @Column(name = "ds_categoria_movimento", nullable = false)
    private String denominacao;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tp_movimento", nullable = false)
    private TipoMovimento tipo;
}

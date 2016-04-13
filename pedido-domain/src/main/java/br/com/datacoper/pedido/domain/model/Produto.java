package br.com.datacoper.pedido.domain.model;

import gumga.framework.domain.GumgaModel; //TODO RETIRAR OS IMPORTS DESNECESSRIOS
import gumga.framework.domain.GumgaMultitenancy;
import java.io.Serializable;
import java.util.*;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.*;
import gumga.framework.domain.domains.*;
import org.hibernate.annotations.Columns;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.envers.Audited;
import com.fasterxml.jackson.annotation.JsonIgnore;

@GumgaMultitenancy
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_Produto")
//@Indexed
@Audited
@Entity
public class Produto extends GumgaModel<Long> {

    @Version
    private Integer version;
    @NotNull
    private GumgaMoney preco;
    @NotNull
    private String descricao;
    @Enumerated(EnumType.STRING)
    private UnidadeMed unidadeMedida;
    @ManyToOne
    private Categoria categoria;

    public Produto() {
    }

    public GumgaMoney getPreco() {
        return this.preco;
    }

    public void setPreco(GumgaMoney preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UnidadeMed getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMed unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

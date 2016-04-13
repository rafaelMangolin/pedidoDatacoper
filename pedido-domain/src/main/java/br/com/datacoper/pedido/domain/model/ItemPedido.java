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
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_ItemPedido")
//@Indexed
@Audited
@Entity
public class ItemPedido extends GumgaModel<Long> {

    @Version
    private Integer version;
    @NotNull
    private GumgaMoney precoUnitario;
    @NotNull
    private GumgaMoney valorTotal;
    @NotNull
    private BigDecimal quantidade;
    @ManyToOne
    private Produto pedido;

    public ItemPedido() {
    }

    public GumgaMoney getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(GumgaMoney precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public GumgaMoney getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(GumgaMoney valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getPedido() {
        return this.pedido;
    }

    public void setPedido(Produto pedido) {
        this.pedido = pedido;
    }
}

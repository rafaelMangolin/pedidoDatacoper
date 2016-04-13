package br.com.datacoper.pedido.domain.model;
import gumga.framework.domain.GumgaModel; //TODO RETIRAR OS IMPORTS DESNECESSARIOS
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
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_ItemEstoque")
//@Indexed
@Audited
@Entity
public class ItemEstoque extends GumgaModel<Long> {

    @Version
    private Integer version;
	@NotNull
	private BigDecimal quantidade;
	@NotNull
	private Date data;
	@NotNull
	private String local;
	@ManyToOne
	private Produto produto;

	public ItemEstoque() {
	}

	public BigDecimal getQuantidade() {
		return this.quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return this.data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	public String getLocal() {
		return this.local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public Produto getProduto() {
		return this.produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
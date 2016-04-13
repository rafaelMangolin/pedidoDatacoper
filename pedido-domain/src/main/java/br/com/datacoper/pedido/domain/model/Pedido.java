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
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_Pedido")
//@Indexed
@Audited
@Entity
public class Pedido extends GumgaModel<Long> {

    @Version
    private Integer version;
	@NotNull
	private Date data;
	@NotNull
	private GumgaMoney valorTotal;
	private String observacao;
	private TipoOperacao tipoOperacao;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemPedido> itensPedido;
	@ManyToOne
	private Pessoa pessoa;

	public Pedido() {
	}

	public Date getData() {
		return this.data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	public GumgaMoney getValorTotal() {
		return this.valorTotal;
	}
	public void setValorTotal(GumgaMoney valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getObservacao() {
		return this.observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoOperacao getTipoOperacao() {
		return this.tipoOperacao;
	}
	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public List<ItemPedido> getItensPedido() {
		return this.itensPedido;
	}
	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
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
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_Pessoa")
//@Indexed
@Audited
@Entity
public class Pessoa extends GumgaModel<Long> {

    @Version
    private Integer version;
	@NotNull
	private String nome;
	private Date dataNascimento;
	@NotNull
	private Sexo sexo;
	private String docReg;
	private GumgaCPF cpf;
	private GumgaPhoneNumber telefone;
	@Columns(columns = {
	@Column(name = "endereco_zip_code"),
	@Column(name = "endereco_premisse_type"),
	@Column(name = "endereco_premisse"),
	@Column(name = "endereco_number"),
	@Column(name = "endereco_information"),
	@Column(name = "endereco_neighbourhood"),
	@Column(name = "endereco_localization"),
	@Column(name = "endereco_state"),
	@Column(name = "endereco_country")
	})
	private GumgaAddress endereco;
	private GumgaEMail email;
	@ManyToMany
	private List<Papel> papeis;

	public Pessoa() {
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return this.sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getDocReg() {
		return this.docReg;
	}
	public void setDocReg(String docReg) {
		this.docReg = docReg;
	}

	public GumgaCPF getCpf() {
		return this.cpf;
	}
	public void setCpf(GumgaCPF cpf) {
		this.cpf = cpf;
	}

	public GumgaPhoneNumber getTelefone() {
		return this.telefone;
	}
	public void setTelefone(GumgaPhoneNumber telefone) {
		this.telefone = telefone;
	}

	public GumgaAddress getEndereco() {
		return this.endereco;
	}
	public void setEndereco(GumgaAddress endereco) {
		this.endereco = endereco;
	}

	public GumgaEMail getEmail() {
		return this.email;
	}
	public void setEmail(GumgaEMail email) {
		this.email = email;
	}

	public List<Papel> getPapeis() {
		return this.papeis;
	}
	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}
}
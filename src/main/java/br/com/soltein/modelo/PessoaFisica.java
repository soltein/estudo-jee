package br.com.soltein.modelo;

import br.com.soltein.modelo.Pessoa;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity
public class PessoaFisica extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String identidade;
	private Date dataNascimento;
	private Sexo sexo;

	public PessoaFisica() {
		super();
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getIdentidade() {
		return this.identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}   
	
	@Temporal(TemporalType.DATE)
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
   
}

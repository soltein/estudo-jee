package br.com.soltein.modelo;

import br.com.soltein.modelo.Pessoa;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String razaosocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;

	public PessoaJuridica() {
		super();
	}   
	public String getRazaosocial() {
		return this.razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}   
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}   
	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}   
	public String getInscricaoMunicipal() {
		return this.inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
   
}

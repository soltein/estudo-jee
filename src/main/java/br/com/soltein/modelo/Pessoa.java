package br.com.soltein.modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Table(name="pessoa")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Pessoa implements Serializable {

	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}   
	
	@Id
	@GeneratedValue(generator="genpessoa")
	@SequenceGenerator(sequenceName = "pessoa_codigo_seq", name="genpessoa")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

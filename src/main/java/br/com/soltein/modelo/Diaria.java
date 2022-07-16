package br.com.soltein.modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Diaria
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo")
public class Diaria implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private Integer id;
	private Date data;
	private Collection<PessoaFisica> hospedes;

	public Diaria() {
		super();
	}   
	
	@Id    
	@GeneratedValue
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@ManyToMany
	@JoinTable(name="hospedagem", 
			  	joinColumns = @JoinColumn(name="diaria_id"),
			  	inverseJoinColumns = @JoinColumn(name="pessoa_id"))
	public Collection<PessoaFisica> getHospedes() {
		return hospedes;
	}

	public void setHospedes(Collection<PessoaFisica> hospedes) {
		this.hospedes = hospedes;
	}
   
	
}

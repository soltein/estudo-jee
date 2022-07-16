package br.com.soltein.modelo;

import br.com.soltein.modelo.Diaria;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity
public class DiariaReservada extends Diaria implements Serializable {
	private static final long serialVersionUID = 1L;
	private Reserva reserva;
	
	public DiariaReservada() {
		super();
	}

	@ManyToOne
	@JoinColumn(name="reserva_id")
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}   
}

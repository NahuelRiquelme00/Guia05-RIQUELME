package reparaFix;

import java.time.LocalDate;

public class Trabajo implements Contratable {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Servicio servicio;
	
	public Trabajo(Servicio servicio, LocalDate fechaInicio) {
		this.servicio = servicio;
		this.fechaInicio = fechaInicio;
	}

	public boolean finalizado() {
		return fechaFin!=null;
	}
	
	public boolean oficioCompatible(Oficio oficio) {
			return this.servicio.oficioCompatible(oficio);	
	}

	@Override
	public double costo() {
		return servicio.costo();
	}

	@Override
	public boolean noFinalizado() {
		return this.fechaFin==null;
	}
	
	public boolean fechaOcupada(Trabajo t) {
		return this.fechaInicio.equals(t.fechaInicio);
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
}

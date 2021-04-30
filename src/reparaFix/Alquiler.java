package reparaFix;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Contratable {
	
	private Herramienta herramienta;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate fechaDevolucion;
	
	public Alquiler(Herramienta herramienta, LocalDate fechaInicio, int cantDias) {
		this.herramienta = herramienta;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaInicio.plusDays(cantDias);
	}
	
	@Override
	public double costo() {
		long dias;
		if(fechaDevolucion==null) {
			dias = ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());
		}else {
			dias = ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);
		}
		return herramienta.calcularCosto(dias);
	}
	
	public boolean enMora() {
		return  ( (fechaDevolucion==null && LocalDate.now().isAfter(fechaFin)) || fechaDevolucion.isAfter(fechaFin) );
	}
	
	public boolean finalizado() {
		return fechaDevolucion!=null;
	}
	
	@Override
	public boolean noFinalizado() {
		return fechaDevolucion==null;
	}

}

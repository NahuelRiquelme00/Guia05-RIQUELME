package reparaFix;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private String nombre;
	private String correo;
	private Oficio oficio;
	private double costoHora;
	private double comision;
	private List<Trabajo> trabajosAsignados;
	
	public Trabajador(String nombre, String correo, Oficio oficio, double costoHora, double comision) {
		super();
		this.setNombre(nombre);
		this.setCorreo(correo);
		this.oficio = oficio;
		this.setCostoHora(costoHora);
		this.setComision(comision);
		this.trabajosAsignados = new ArrayList<Trabajo>();
		
	}
	
	public void agregarTarea (Trabajo trabajo) throws OficioNoCoincideException, AgendaOcupadaException {
		if(!trabajo.oficioCompatible(this.oficio)) {
			throw new OficioNoCoincideException();
		}
		if(this.trabajadorNoDisponible(trabajo)) {
			throw new AgendaOcupadaException();
		}
		
		this.trabajosAsignados.add(trabajo);
	}
	
	public boolean trabajadorNoDisponible(Trabajo trabajo) {
		return this.trabajosAsignados.stream().anyMatch((t) -> { return t.fechaOcupada(trabajo);});
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public double getCostoHora() {
		return costoHora;
	}

	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}


}

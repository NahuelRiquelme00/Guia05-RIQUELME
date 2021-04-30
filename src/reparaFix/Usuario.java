package reparaFix;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String email;
	private List<Contratable> contratos;
	
	public Usuario(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contratos = new ArrayList<Contratable>();
	}
	
	public void contratar (Servicio servicio, LocalDate fecha) {
		contratos.add(new Trabajo(servicio, fecha));
	}
	
	public void contratar(Herramienta herramienta, LocalDate fechaInicio, int cantDias) throws AlquilerNoEntregadoException {
		if(this.alquierNoPermitido()) {
			throw new AlquilerNoEntregadoException();
		}
		this.contratos.add(new Alquiler(herramienta, fechaInicio, cantDias));
	}	
	
	public boolean alquierNoPermitido() {
		return contratos.stream().filter(Contratable::noFinalizado).count()>=2;		
	}
	
	public double consumoTotal() {
		double total=0;
		for(Contratable c: this.contratos) {
			total+=c.costo();
		}
		return total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

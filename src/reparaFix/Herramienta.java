package reparaFix;

public class Herramienta {
	
	private String nombre;
	private double costoPordia;
	
	public Herramienta(String nombre, double costoPordia) {
		super();
		this.setNombre(nombre);
		this.costoPordia = costoPordia;
	}

	public double calcularCosto (long cantDias) {
		return this.costoPordia * cantDias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}

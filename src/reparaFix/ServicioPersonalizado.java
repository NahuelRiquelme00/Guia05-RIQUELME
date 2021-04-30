package reparaFix;

public class ServicioPersonalizado extends Servicio {
	
	private double costoPresupuesto;
	private double costoTransporte;
	private double costoMateriales;
	
	
	public ServicioPersonalizado(Oficio tipo, boolean urgente, double costoPresupuesto, double costoTransporte, double costoMateriales) {
		this.tipo=tipo;
		this.urgente=urgente;
		this.costoPresupuesto = costoPresupuesto;
		this.costoTransporte = costoTransporte;
		this.costoMateriales = costoMateriales;
	}


	@Override
	public double costo() {
		double total = costoPresupuesto + costoMateriales + costoTransporte;
		if(this.esUrgente()) total *= 0.5;
		return total;
	}
	
	public boolean oficioCompatible(Oficio oficio) {
		return this.tipo.equals(oficio);
	}
	

}

package reparaFix;

public abstract class Servicio {
	
	protected Oficio tipo;
	protected boolean urgente;
	
	public boolean esUrgente(){
		return urgente;
	}
	
	public abstract double costo();
	
	public abstract boolean oficioCompatible(Oficio oficio);
	
}

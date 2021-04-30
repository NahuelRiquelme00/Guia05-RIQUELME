package reparaFix;

public class ServicioEstandar extends Servicio{
	
	private double costoFijo;
	private double comisionProfesional;
	
	public ServicioEstandar(Oficio tipo, boolean urgente, double costoFijo, double comisionProfesional) {
		this.tipo=tipo;
		this.urgente=urgente;	
		this.costoFijo=costoFijo;
		this.comisionProfesional=comisionProfesional;
	}

	@Override
	public double costo() {
		double total = this.costoFijo + this.costoFijo*comisionProfesional;
		if(this.esUrgente()) total *= 0.5;
		return total;
	}	
	
	public boolean oficioCompatible(Oficio oficio) {
		return this.tipo.equals(oficio);
	}


}

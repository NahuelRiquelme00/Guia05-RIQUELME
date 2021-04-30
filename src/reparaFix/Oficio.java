package reparaFix;

public class Oficio {
	
	private String tipo;
	
	public Oficio(String tipo) {
		this.tipo = tipo;
	}

	public boolean equals(Oficio oficio) {
		return this.tipo == oficio.tipo;
	}
	
}

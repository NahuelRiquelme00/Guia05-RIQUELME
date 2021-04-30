package reparaFix;

public class OficioNoCoincideException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El oficio del trabajador no coincide con el oficio necesario para el trabajo";
	}

}

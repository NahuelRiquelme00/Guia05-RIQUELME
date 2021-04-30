package reparaFix;

public class AlquilerNoEntregadoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El usuario tiene mas 2 dos alquieres sin devolver";
	}

}

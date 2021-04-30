package reparaFix;

public class AgendaOcupadaException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El trabajador ya tiene asignado un trabajo en esa fecha";
	}

}

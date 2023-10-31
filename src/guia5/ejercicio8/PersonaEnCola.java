package guia5.ejercicio8;

public class PersonaEnCola {
	private int orden;
	private Persona persona;
	
	public PersonaEnCola(int orden, Persona persona) {
		this.orden = orden;
		this.persona = persona;
	}

	public int getOrden() {
		return orden;
	}

	public Persona getPersona() {
		return persona;
	}

	@Override
	public String toString() {
		return "PEnCola [orden=" + orden + ", p=" + persona + "]";
	}
	
	
}

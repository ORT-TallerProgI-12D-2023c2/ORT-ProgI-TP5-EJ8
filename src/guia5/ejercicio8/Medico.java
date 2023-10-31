package guia5.ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Medico extends Persona {

	private String matricula;
	
	public Medico(String dNI, String nombre, int edad, boolean deRiesgo, String matricula) {
		super(dNI, nombre, edad, deRiesgo);
		this.matricula = matricula;
	}

	public Prioridad getPrioridad() {
		return Prioridad.MAXIMA;
	}

}
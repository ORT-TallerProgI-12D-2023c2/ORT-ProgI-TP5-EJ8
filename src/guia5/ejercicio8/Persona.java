package guia5.ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Persona implements Vacunable {

	private String DNI;
	private String nombre;
	private int edad;
	private boolean deRiesgo;

	public Persona(String dNI, String nombre, int edad, boolean deRiesgo) {
		this.DNI = dNI;
		this.nombre = nombre;
		this.edad = edad;
		this.deRiesgo = deRiesgo;
	}

	public Prioridad getPrioridad() {
		Prioridad aRetornar = Prioridad.MEDIA;
		if (this.edad < 30) {
			aRetornar = Prioridad.MINIMA;
		} else if (this.deRiesgo || this.edad > 60) {
			aRetornar = Prioridad.MAXIMA;
		}
		return aRetornar;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", deRiesgo=" + deRiesgo + "]";
	}

}
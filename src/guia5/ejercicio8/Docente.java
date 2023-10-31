package guia5.ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Docente extends Persona {

	private NivelEducativo nivel;

	public Docente(String dNI, String nombre, int edad, boolean deRiesgo, NivelEducativo nivel) {
		super(dNI, nombre, edad, deRiesgo);
		this.nivel = nivel;
	}

	public Prioridad getPrioridad() {
		Prioridad aRetornar = Prioridad.MEDIA;
		if (this.nivel == NivelEducativo.INICIAL) {
			aRetornar = Prioridad.MAXIMA;
		}
		return aRetornar;
	}

}
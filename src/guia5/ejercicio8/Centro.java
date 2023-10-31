package guia5.ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Centro {

	private static final int CANT_COLAS = 3;
	private ColaDePersonas[] colas;
	
	public Centro() {
		this.colas = new ColaDePersonas[CANT_COLAS];
		crearColas();
		crearPersonasFake();
	}	

	public ColaDePersonas obtenerColaPorPrioridadYOrden() {
		ColaDePersonas colaFinal = new ColaDePersonas();
		ListaDePersonasEnColaPorPrioridadYOrden lista = new ListaDePersonasEnColaPorPrioridadYOrden();
		pasarPersonasAListaOrdenada(lista);
		pasarListaAColaFinal(lista, colaFinal);
		return colaFinal;
	}

	private void pasarListaAColaFinal(ListaDePersonasEnColaPorPrioridadYOrden lista, ColaDePersonas colaFinal) {
		for (PersonaEnCola personaEnCola : lista) {
			colaFinal.add( personaEnCola.getPersona() );
		}		
	}

	private void pasarPersonasAListaOrdenada(ListaDePersonasEnColaPorPrioridadYOrden lista) {
		for (int i = 0; i < colas.length; i++) {
			vaciarColaYAgregarALista(this.colas[i], lista);
		}		
	}

	private void vaciarColaYAgregarALista(ColaDePersonas colaDePersonas,
			ListaDePersonasEnColaPorPrioridadYOrden lista) {
		int contador = 1;
		while (!colaDePersonas.isEmpty()) {
			Persona p = colaDePersonas.remove();
			lista.add( new PersonaEnCola(contador, p) );
			contador++;
		}		
	}

	private void crearColas() {
		for (int i = 0; i < colas.length; i++) {
			this.colas[i] = new ColaDePersonas();
		}		
	}
	
	private void crearPersonasFake() {
		this.colas[0].add(new Persona("111", "Juan", 35, true)); // Prioridad: Máxima (paciente de riesgo)
		this.colas[1].add(new Persona("222", "Maria", 28, false)); // Prioridad: M (edad < 30 años)
		this.colas[2].add(new Persona("333", "Carlos", 40, true)); // Prioridad: Máxima (paciente de riesgo)
		this.colas[0].add(new Docente("444", "Laura", 30, false, NivelEducativo.PRIMARIO)); // Prioridad: Media (edad < 30 años)
		this.colas[1].add(new Docente("555", "Andres", 45, true, NivelEducativo.SECUNDARIO)); // Prioridad: Máxima (trabajador esencial)
		this.colas[2].add(new Docente("666", "Sofia", 31, false, NivelEducativo.INICIAL)); // Prioridad: Media (trabajador en educación)
		this.colas[0].add(new Medico("777", "Pedro", 39, true, "MAT12345")); // Prioridad: Máxima (trabajador esencial)
		this.colas[1].add(new Medico("888", "Ana", 32, false, "MAT54321")); // Prioridad: Máxima (trabajador esencial)
		this.colas[2].add(new Persona("999", "Roberto", 47, true)); // Prioridad: Máxima (paciente de riesgo)
		this.colas[0].add(new Persona("1010", "Luisa", 81, false)); // Prioridad: Máxima (edad > 60 años)
		this.colas[1].add(new Docente("1111", "Javier", 36, true, NivelEducativo.SECUNDARIO)); // Prioridad: Máxima (trabajador en educación)
		this.colas[2].add(new Docente("1212", "Marta", 29, false, NivelEducativo.PRIMARIO)); // Prioridad: Media (edad < 30 años)
		this.colas[0].add(new Medico("1313", "Raul", 42, true, "MAT98765")); // Prioridad: Máxima (trabajador esencial)
		this.colas[1].add(new Medico("1414", "Elena", 34, true, "MAT34567")); // Prioridad: Máxima (trabajador esencial)
		this.colas[2].add(new Medico("1515", "Ricardo", 40, false, "MAT78901")); // Prioridad: Máxima (trabajador esencial)
		this.colas[0].add(new Persona("1616", "Luis", 70, true)); // Prioridad: Máxima (paciente de riesgo)
		this.colas[1].add(new Persona("1717", "Carolina", 45, false)); // Prioridad: Media (edad > 30 años)
		this.colas[2].add(new Persona("1818", "Diego", 33, true)); // Prioridad: Media (edad > 30 años)
	}
}
package guia5.ejercicio8;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDePersonasEnColaPorPrioridadYOrden extends ListaOrdenadaNodos<Integer, PersonaEnCola> {

	@Override
	public int compare(PersonaEnCola pEnC1, PersonaEnCola pEnC2) {
		int criterio = pEnC1.getPersona().getPrioridad().ordinal() - pEnC2.getPersona().getPrioridad().ordinal();
		if (criterio == 0) {
			criterio = pEnC1.getOrden() - pEnC2.getOrden();
		}
		return criterio;
	}

	@Override
	public int compareByKey(Integer clave, PersonaEnCola elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

}

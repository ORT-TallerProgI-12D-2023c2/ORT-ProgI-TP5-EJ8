package guia5.ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		Centro c = new Centro();
		
		ColaDePersonas laCola = c.obtenerColaPorPrioridadYOrden();
		
		mostrarCola(laCola);
	}

	private static void mostrarCola(ColaDePersonas cola) {
		Persona cent = new Persona("","",0,false);
		cola.add(cent);
		Persona p = cola.remove();
		while(p != cent) {
			System.out.println(p);
			cola.add(p);
			p = cola.remove();
		}
 	}

	
}
package unico;

import model.Empleado;

public class Principal {

	public static void main(String[] args) {

		GestionFch gest = new GestionFch("datos.db");
		
		gest.escribirRegistro(1, new Empleado("Pepe", 45, 1.68));
		gest.escribirRegistro(2, new Empleado("Juan", 27, 1.50));
		
	}

}

package unico;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Empleado;
import model.GestionFch;

public class Principal {

	public static void main(String[] args) throws IOException {

		
		
		//gest.escribirRegistro(1, new Empleado("Juan Manuel", "Tena Luque", 652312433, 36, 1450.0));
		//gest.escribirRegistro(2, new Empleado("Antonio", "Torres", 666333222, 22, 1800.0));
		
		gestionMenu();
		
		/*
		Empleado emp2 = gest.leerRegistro(1);
		gest.cerrarFichero();
		System.out.println(emp2);
		*/
		
		
		System.out.println("Fin del programa");
		
	}
	
	public static byte menu() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Menu de empleados");
        System.out.println("-----------------------");
        System.out.println("1. Listar todo");
        System.out.println("2. Buscar por posición");
        System.out.println("3. Modificar");
        System.out.println("4. Añadir");
        System.out.println("0. Salir");
        
        System.out.println("\nIntroduzca una opción: ");
        
        String entrada;
        byte opcion = 0;
        
		try {
			entrada = br.readLine();
			opcion = Byte.parseByte(entrada);
		} catch (IOException e) {
			System.out.println("Introduce un numero por favor");
		}
        return opcion;
    }
	
	public static void gestionMenu() {
		GestionFch gest = new GestionFch("datos.db");
		
		byte opcion = menu();
        switch (opcion) {
        case 1: // Listar todo
            gest.listarTodo();
            break;
        case 2: // Buscar
            break;
        case 3: // Borrar
            break;
        case 4: // Actualizar
        }
	}

}

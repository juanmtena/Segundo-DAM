package unico;

import java.io.*;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		File fch = new File("ejemplo.txt");
		ArrayList<String> datos = new ArrayList<String>();
		datos.add("Hola");
		datos.add("Adios");
		datos.add("Sevilla");
		
		String texto = "1234512345634567567867890";
		
		escribirFchArray(fch, datos);
		
	}
	
	
	/*private static void escribirFch(File fch, ArrayList<String> datos) {
		try {
			//Abrir el fichero
			FileWriter fichero = new FileWriter(fch);
			//Crea un buffer para escribir datos y que se envien al fichero
			BufferedWriter bufEscritura = new BufferedWriter(fichero);
			//Volcamos el texto que queremos guardar sobre el buffer
			//y este buffer lo escribe en el fichero
			bufEscritura.write(datos);
			//Vaciamos el buffer de datos que queden pendientes por escribir
			bufEscritura.flush();//vaciar el buffer(para que no se pierda informacion) y se hace antes de cerrarlo
			//Cerramos la comunicacion con el buffer
			bufEscritura.close();
			//Cerramos el fichero
			fichero.close();
		}catch (IOException e) {
			System.err.println("Error accediendo al fichero");
		}
	}*/
	
	private static void escribirFchArray(File fch, ArrayList<String> datos) {
		try {
			
			//Apertura
			FileWriter fichero = new FileWriter(fch);
			BufferedWriter bufEscritura = new BufferedWriter(fichero);
			
			//Proceso
			for (int i = 0; i < datos.size(); i++) {
				bufEscritura.write(datos.get(i));
				if(i > datos.size() - 1) {
					bufEscritura.newLine();
				}
			}
			
			//Cierre
			bufEscritura.flush();//vaciar el buffer (para que no se pierda información) y se hace antes de cerrarlo
			bufEscritura.close();
			fichero.close();
		}catch (IOException e) {
			System.err.println("Error accediendo al fichero");
		}
	}

}

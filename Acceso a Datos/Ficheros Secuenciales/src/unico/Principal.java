package unico;

import java.io.*;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		File fch = new File("ejemplo.txt");
		File fichero2 = new File("ejemplo2.txt");
		ArrayList<String> datos = new ArrayList<String>();
		datos.add("Hola");
		datos.add("Adios");
		datos.add("Betis");
		
		String texto = "1234512345634567567867890";
		
		//escribirFchArray(fch, datos);
		lecturaFchArray(fch);
		escribirCopia(fch, fichero2);
		
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
	
	
		//////////////////////////////////////
		////           LECTURA             ///
		//////////////////////////////////////
	private static void lecturaFchArray(File fch) {
		
		try {
			FileReader fichero = new FileReader(fch);
			BufferedReader bufLectura = new BufferedReader(fichero);
			
			String lineaLeida;
			lineaLeida = bufLectura.readLine(); 
			
			while(lineaLeida != null) {
				System.out.println(lineaLeida);
				lineaLeida = bufLectura.readLine();
			}
			
			bufLectura.close();
			fichero.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + fch + " no existe");
		} catch (IOException e) {
			System.err.println("Se ha producido un error accediendo a " + fch);
		}
		
	}
	
	
		//////////////////////////////////////
		////           ESCRITURA          ////
		//////////////////////////////////////
	private static void escribirFchArray(File fch, ArrayList<String> datos) {
		
		try {			
			//Apertura. Siempre que se vaya a leer o escribir una fila entera, hay que hacer un FileReader o FileWriter
			FileWriter fichero = new FileWriter(fch);
			BufferedWriter bufEscritura = new BufferedWriter(fichero);
			
			
			//Otra manera de hacer el bufferedReader es asi:
			//BufferedWriter bufEscritura = new BufferedWriter(new FileWriter(fch));
			
			
			//Proceso para escritura de varios strings en una lista
			for (int i = 0; i < datos.size(); i++) {
				bufEscritura.write(datos.get(i));
				if(i < datos.size() - 1) {
					bufEscritura.newLine();
				}
			}
			
			
			
			//Proceso para la escritura de un solo String
			//String sTexto = "Hola";
			//bufEscritura.write(sTexto);
			
			
			
			//Cierre
			bufEscritura.flush();//vaciar el buffer(para que no se pierda informacion) y se hace antes de cerrarlo
			bufEscritura.close();
			fichero.close();
		}catch (IOException e) {
			System.err.println("Error accediendo al fichero");
		}
	}
	
	
	
		//////////////////////////////////////
		////       COPIAR ARCHIVO          ///
		//////////////////////////////////////
	private static void escribirCopia(File fch, File fichero2) {
		
		try {
			FileReader fichero = new FileReader(fch);
			BufferedReader bufLectura = new BufferedReader(fichero);
			FileWriter ficheroLectura = new FileWriter(fichero2);
			BufferedWriter bufEscritura = new BufferedWriter(ficheroLectura);
			
			String cadena = bufLectura.readLine();
			int contador = 0;
			
			while(cadena != null) {
				if(contador == 0) {
					bufEscritura.write(cadena);
					contador++;
				} else {
					bufEscritura.write("\n" + cadena);
				}
				cadena = bufLectura.readLine();
			}
			
			bufLectura.close();
			bufEscritura.flush();
			bufEscritura.close();
			fichero.close();
			ficheroLectura.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	
	
	}

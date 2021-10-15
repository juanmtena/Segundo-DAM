package unico;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import model.Persona;

public class Principal {

	public static void main(String[] args) {

		File fichero = new File("personas.txt");
		File fichero2 = new File("personas2.txt");
		
		ArrayList<Persona> gente = leerPersona(fichero);
		gente.forEach(p -> System.out.println(p));
		
		escribirPersonas(fichero2, gente);
	}
	
	public static ArrayList<Persona> leerPersona(File fichero) {		
		
		ArrayList<Persona> contenido = new ArrayList<Persona>();
		
		try {
			FileReader fch = new FileReader(fichero);
			BufferedReader bufLectura = new BufferedReader(fch);
			
			String lineaLeida;
			lineaLeida = bufLectura.readLine(); 
			
			while(lineaLeida != null) {
				//A continuacion proceso la linea leida...
				StringTokenizer campo = new StringTokenizer(lineaLeida, "#");//Para borrar las almohadillas que haya escrita
				String nombre = campo.nextToken();
				String apellidos = campo.nextToken();
				String edad = campo.nextToken();
				
				contenido.add(new Persona(nombre, apellidos, Integer.parseInt(edad)));
				
				//Realizamos una nueva lectura
				lineaLeida = bufLectura.readLine();
			}
			
			bufLectura.close();
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + fichero + " no existe");
		} catch (IOException e) {
			System.err.println("Se ha producido un error accediendo a " + fichero);
		}
		
		return contenido;
		
	}
	
	public static void escribirPersonas(File fichero, ArrayList<Persona> gente) {
	
		
		
	}
	
		
	
	
	

}

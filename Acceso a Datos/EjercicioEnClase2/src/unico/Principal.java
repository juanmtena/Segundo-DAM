package unico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import model.Conexion;

public class Principal {
	
	public static void main(String[] args) {
		
		File fichero = new File("conexion.txt");
	
		Conexion conn = leerConfiguracion(fichero);
		System.out.println(conn);
		
	}

	private static Conexion leerConfiguracion(File fichero) {
		
		Conexion contenido = new Conexion();
		final String SEPARADOR = ":";
		
		try {
			FileReader fch = new FileReader(fichero);
			BufferedReader bufLectura = new BufferedReader(fch);
			
			contenido.setHost(bufLectura.readLine().split(SEPARADOR)[1]);
			contenido.setPort(bufLectura.readLine().split(SEPARADOR)[1]);
			contenido.setDbName(bufLectura.readLine().split(SEPARADOR)[1]);
			contenido.setUserName(bufLectura.readLine().split(SEPARADOR)[1]);
			contenido.setUserPass(bufLectura.readLine().split(SEPARADOR)[1]);					
			
			bufLectura.close();
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + fichero + " no existe");
		} catch (IOException e) {
			System.err.println("Se ha producido un error accediendo a " + fichero);
		}
		
		return contenido;
	}
	
	private static Conexion leerConfiguracion_v2(File fichero) {
		return null;
	}
	
	
	
}

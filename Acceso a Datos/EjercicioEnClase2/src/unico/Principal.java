package unico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
	
	
	/////////////////////////////////////
	/////            MAPA           /////
	/////////////////////////////////////
	private static void leerMapa(File fichero) {
		
	    String sLinea, sClave, sValor;
	    String[] sCampos;
	    Conexion oConnection;

	    try {
	        BufferedReader bfReader = new BufferedReader(new FileReader(fichero));
	        Map<String,String> mCampos = new HashMap<String,String>();

	        sLinea = bfReader.readLine();
	        while(sLinea != null) {
	            sCampos = sLinea.split(":");//split separa el String cada vez que ve ese caracter ylo convierte en un array

	            if(!sCampos[0].isEmpty()) {
	            	sClave = sCampos[0].trim().toUpperCase();//trim quita los espacios en blanco
	            	sValor = sCampos[1].trim();

	                mCampos.put(sClave, sValor);//put asigna los valores. Es como el add para las listas que aqui se llaman put
	            }
	            sLinea = bfReader.readLine();
	        }

	        oConnection = new Conexion( mCampos.get("HOST"), mCampos.get("PORT"), 
	                					mCampos.get("DBNAME"), mCampos.get("USERNAME"), mCampos.get("USERPASS"));
	        System.out.println(oConnection);

	        bfReader.close();

	    } catch (FileNotFoundException e) {
	        System.out.println("No se ha encontrado el fichero.");
	    } catch(IOException e) {
	        System.out.println("Error en el acceso al fichero.");
	    }
		
	}
	
	
	
	
}

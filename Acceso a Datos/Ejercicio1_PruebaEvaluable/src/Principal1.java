import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal1 {

	public static void main(String[] args) {

		String ruta = "C:\\Users\\Usuario\\Documents\\GitHub\\Segundo-DAM\\Acceso a Datos\\Ejercicio1_PruebaEvaluable\\documentos";
		String cadena = "col";
		
		File fichero = new File(ruta);
		
		nombresFichero(fichero, cadena);
		
	}
	
	private static ArrayList<String> nombresFichero (File fichero, String cadena) {
		
		File[] dirContenido = fichero.listFiles();
		ArrayList<String> nombres = new ArrayList<String>();
		String sFchNombreArchivo = fichero.getName();
		
		for(File f : dirContenido) {
			if(sFchNombreArchivo == cadena) {
				System.out.println(sFchNombreArchivo);
				nombres.add(sFchNombreArchivo);
			}
		}
		
		return nombres;
	}

}

import java.io.File;
import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Usuario\\Documents\\GitHub\\Segundo-DAM\\Acceso a Datos\\Ejercicio1_PruebaEvaluable\\documentos";
		String cadenaBuscada = "enero";
		
		File fichero = new File(ruta);		
		encontrarFichero (fichero, cadenaBuscada);

	}
	
	private static ArrayList<String> encontrarFichero (File fichero, String cadenaBuscada) {
		
		File[] dirContenido = fichero.listFiles();
		ArrayList<String> nombres = new ArrayList<String>();
		String sFchNombreArchivo = fichero.getName();
		
		for(File f : dirContenido) {
			if(sFchNombreArchivo == cadenaBuscada) {
				System.out.println(sFchNombreArchivo);
				nombres.add(sFchNombreArchivo);
			}
		}
		
		return nombres;
	}
	
	

}

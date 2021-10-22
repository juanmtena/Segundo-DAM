import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {

		// Mi app apunta a un fichero...
		
		//String sFichero = "ficheros\\ciudades.txt"; //Acceso a fichero
		//String sFichero = "ficheros"; // Acceso a carpeta
		String sFichero = "C:\\Users\\Usuario"; // Acceso a Disco Duro

		 
		File fch = new File(sFichero);
		
		if(fch.exists()) {
			if(fch.isDirectory()) {
				infoDir(fch);
				System.out.println(contarCarpetas(fch));
			}else {
				infoFile(fch);
			}
			
		} else {
			System.out.println("No existe");
		}
		
	}
	
	private static void contadorItems(File fch) {
		File[] dirContenido = fch.listFiles();
		
		int contDir = 0;
		int contFch = 0;
		
		for(File f : dirContenido) {
			if(f.isDirectory()) {
				contDir++;
			} else {
				contFch++;
			}
		}
		System.out.println("Hay: " + contDir + " Carpetas, " + contFch + "Ficheros.");
		
	}
	
	
	private static void diffTipoContenido(File fch) {
		File[] dirContenido = fch.listFiles();
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> nombres2 = new ArrayList<String>();
		
		String infoPrevio = "";
		
		for(File f : dirContenido) {
			infoPrevio = f.isDirectory() ? "DIR" : "FCH";
			nombres.add(infoPrevio + " " + f.getName());
			if(f.isDirectory() == true) {
				for(File f2 : dirContenido) {
					infoPrevio = f2.isDirectory() ? "DIR" : "FCH";
					nombres2.add(infoPrevio + " " + f.getName());
				}
			}
		}
		
		Collections.sort(nombres);
		nombres.forEach((nombre) -> System.out.println(nombre));
	}
	
	private static int contarCarpetas(File fch) {
		File[] dirContenido = fch.listFiles();
		int c = dirContenido.length;
		
		for(int iContador = 0; iContador < dirContenido.length; iContador++) {
			if(dirContenido[iContador].isDirectory()) {
				if(dirContenido[iContador].listFiles() != null)
				c += contarCarpetas(dirContenido[iContador]);
			}
		}
		return c;
	}
	
	private static int contarSubcarpetas(File fch) {
		File[] dirContenido = fch.listFiles();
		int c = 0;
		
		for(int iContador = 0; iContador < dirContenido.length; iContador++) {
			if(dirContenido[iContador].isDirectory()) {
				if(dirContenido[iContador].listFiles() != null)
				c++;
				c += contarSubcarpetas(dirContenido[iContador]);
			}
		}
		return c;
	}
	
	//EJERCICIOS PARA PRACTICAR
	//Contar los ficheros, contar los archivos que contengan la palabra "tal"

	private static void infoDir(File fch) {
		System.out.println("Es un directorio");
		
		long lEspacioLibreBytes = fch.getFreeSpace();
		long lEspacioLibreMB = fch.getFreeSpace() / 1024 / 1024;
		long lEspacioLibreGB = lEspacioLibreMB / 1024;
		
		File[] dirContenido = fch.listFiles();
		String info;
		byte bContador = 0, bContador2 = 0;
		
		for(File f : dirContenido) {
			
			if(f.isDirectory()) { //Muestra solo si es una carpeta
				//System.out.println("DIR " + f.getName());
				bContador++;
			} else {
				//System.out.println("FCH " + f.getName());
				bContador2++;
			}
			
			//info = f.getName();
			//System.out.println(info);
			
		}
		System.out.println("Hay " + bContador + " directorios.");
		System.out.println("Hay " + bContador2 + " carpetas.");

		System.out.println("Espacio Libre: " + lEspacioLibreBytes + " Bytes");
		System.out.println("Espacio Libre: " + lEspacioLibreMB + "MB");
		System.out.println("Espacio Libre: " + lEspacioLibreGB + "GB");
		
	}

	private static void infoFile(File fch) {
		String sFchNombreArchivo = fch.getName();
		String sFchCarpetaPadre = fch.getParent();
		String sFchRutaAbsoluta = fch.getAbsolutePath();
		
		long lFchBytes = fch.length();
		
		boolean fchPuedeLeer = fch.canRead();
		boolean fchPuedeEscribir = fch.canWrite();
		boolean fchPuedeEjecutar = fch.canExecute();
		
		System.out.println("Nombre archivo: " + sFchNombreArchivo);
		System.out.println("Carpeta Padre: " + sFchCarpetaPadre);
		System.out.println("Ruta absoluta: " + sFchRutaAbsoluta);
		System.out.println("Tamaño (Bytes): " + lFchBytes);
		System.out.println("Se puede leer: " + SiNo(fchPuedeLeer));
		System.out.println("Se puede escribir: " + SiNo(fchPuedeEscribir));
		System.out.println("Se puede ejecutar: " + SiNo(fchPuedeEjecutar));
	}
	
	private static String SiNo(boolean bEjecutar) {
		return bEjecutar ? "Si" : "No";//Es lo mismo que un if else
	}

}

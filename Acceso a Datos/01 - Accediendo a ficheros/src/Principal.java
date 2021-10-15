import java.io.File;

public class Principal {

	public static void main(String[] args) {

		// Mi app apunta a un fichero...
		
		String sFichero = "ficheros\\ciudades.txt";
		 
		File fch = new File(sFichero);
		
		if(fch.exists()) {
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

			
		} else {
			System.out.println("No existe");
		}
		
	}
	
	private static String SiNo(boolean bEjecutar) {
		return bEjecutar ? "Si" : "No";//Es lo mismo que un if else
	}

}

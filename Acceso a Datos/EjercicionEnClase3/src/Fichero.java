import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero {

	public static void main(String[] args) throws IOException {

		File f1 = new File("F1.txt");
		File f2 = new File("F2.txt");
		File comun = new File("comun.txt");
		
		crearFchComun(f1, f2, comun);
		
	}
	
	private static void crearFchComun(File f1, File f2, File comun) throws IOException {
				
		try {
			FileReader fch = new FileReader(f2);
			BufferedReader bufLectura = new BufferedReader(fch);
			
			String lineaLeida1 = "";
			
			lineaLeida1 = bufLectura.readLine();
			
			while(lineaLeida1 != null) {
				if(existeEnFch(f1, lineaLeida1)) {
					anadir(comun, lineaLeida1);
				}
				lineaLeida1 = bufLectura.readLine();
			}
			bufLectura.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + f2 + " no existe.");
		} catch (IOException e) {
			System.err.println("Se ha producido un error con el fichero " + f2);
		} catch (Exception e) {
			System.err.println("Se ha producido un error");
		}
		
	}
	
	private static void anadir(File comun, String lineaLeida1) {
		
		try {
			FileWriter fch = new FileWriter(comun, true);//El true es para que escriba todas las l?neas, si no escribe solo la ?ltima
			BufferedWriter bufEscritura = new BufferedWriter(fch);
			
			bufEscritura.write(lineaLeida1);
			bufEscritura.newLine();
			
			bufEscritura.flush();
			bufEscritura.close();
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + comun + " no existe.");
		} catch (IOException e) {
			System.err.println("Se ha producido un error con el fichero " + comun);
		} catch (Exception e) {
			System.err.println("Se ha producido un error");
		}
		
	}
	
	private static boolean existeEnFch(File f1, String lineaLeida1) {
		boolean encontrada = false;
		String comun = "";
		int contador = 0;
		
		try {
			FileReader fch = new FileReader(f1);
			BufferedReader bufLectura = new BufferedReader(fch);
			
			String lineaLeida2 = "";
			
			lineaLeida2 = bufLectura.readLine();
			while(lineaLeida2 != null && !encontrada) {
				if(lineaLeida2.equals(lineaLeida1)) {
					comun += lineaLeida2;
					encontrada = true;
					contador++;
				}
				lineaLeida2 = bufLectura.readLine();
			}
			
			System.out.println(comun + " ," + contador);
			
			bufLectura.close();
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + f1 + " no existe.");
		} catch (IOException e) {
			System.err.println("Se ha producido un error con el fichero " + f1);
		} catch (Exception e) {
			System.err.println("Se ha producido un error");
		}
		return encontrada;
	}

}

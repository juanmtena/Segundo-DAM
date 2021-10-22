import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal3 {

	public static void main(String[] args) {
		
		File f1 = new File("texto1");
		File f2 = new File("texto2");
		File comun = new File("comun.txt");
		
		escribirFch(f1, f2);

	}
	
	private static void escribirFch(File f1,File f2) {

		try {
			FileWriter fch = new FileWriter(f1);
			String sTexto =   "a\n"
							+ "b\n"
							+ "c\n"
							+ "d";
			
			
			fch.write(sTexto);
			fch.close();
			
			FileWriter fch2 = new FileWriter(f2);
			String sTexto2 =  "a\n"
							+ "b\n"
							+ "b\n"
							+ "a\n"
							+ "c\n"
							+ "g\n"
							+ "c\n"
							+ "a\n"
							+ "c\n"
							+ "c\n"
							+ "g";
			
			fch2.write(sTexto2);
			fch2.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");	
		}
	}
	
	private static void crearFchComun(File f1, File f2, File comun) throws IOException {
		
		try {
			FileReader fch = new FileReader(f1);
			BufferedReader bufLectura = new BufferedReader(fch);
			
			String lineaLeida1 = "";
			
			lineaLeida1 = bufLectura.readLine();
			
			while(lineaLeida1 != null) {
				if(existeEnFch(f2, lineaLeida1)) {
					anadir(comun, lineaLeida1);
				}
				lineaLeida1 = bufLectura.readLine();
			}
			bufLectura.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + f1 + " no existe.");
		} catch (IOException e) {
			System.err.println("Se ha producido un error con el fichero " + f1);
		} catch (Exception e) {
			System.err.println("Se ha producido un error");
		}
		
	}
	
	private static void anadir(File comun, String lineaLeida1) {
		
		try {
			FileWriter fch = new FileWriter(comun, true);//El true es para que escriba todas las líneas, si no escribe solo la última
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
	
	private static boolean existeEnFch(File f2, String lineaLeida1) {
		boolean encontrada = false;
		
		try {
			FileReader fch = new FileReader(f2);
			BufferedReader bufLectura = new BufferedReader(fch);
			
			String lineaLeida2 = "";
			
			lineaLeida2 = bufLectura.readLine();
			while(lineaLeida2 != null && !encontrada) {
				if(lineaLeida2.equals(lineaLeida1)) {
					encontrada = true;
				}
				lineaLeida2 = bufLectura.readLine();
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
		return encontrada;
	}

}

package unico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {
		
		int iClave = 2;
		
		File nombreFichero = new File("notas_enc.txt");
		File nombreFicheroEnc = new File("notas_enc_destino.txt");
		//escribirFch(nombreFichero);
		//introducirDatos(nombreFichero);
		//leerFch(nombreFichero);
		
		File nombreFchSoursce = new File("notas.txt");
		File nombreFchTarget = new File("notas_v2.txt");
		
		//copiarFch(nombreFchSoursce, nombreFchTarget);
		//escribirFchEncriptado(nombreFichero);
		encriptarFchEncriptado(nombreFichero, nombreFicheroEnc, iClave);
		//desencriptarFichero(nombreFicheroEnc, nombreFchTarget, iClave);
		
	}
	
	private static void escribirFchEncriptado(File nombreFichero, File nombreFchSoursce, File nombreFchTarget) {

		String sTexto = "Hola";
		int iClave = 2;
		
		copiarFch(nombreFchSoursce, nombreFchTarget);
		
		try {
			FileWriter fch = new FileWriter(nombreFichero);
			
			for (int c = 0; c < sTexto.length(); c++) {
				char cLetra = sTexto.charAt(c);
				int ascii = cLetra;
				//System.out.println(cLetra + " " + ascii + " " + (cLetra+1) + " " + (char)(cLetra+1));
				fch.write(cLetra + iClave);
			}
			
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");	
		}
		
	}
	
	private static void encriptarFchEncriptado(File nombreFichero, File nombreFicheroEnc, int iClave) {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String sTexto = "";
		
		try {
			FileWriter fch = new FileWriter(nombreFichero);
			
			do {
				System.out.println("Introduzca el texto que desea guardar: ");
				sTexto = teclado.readLine();
				if(sTexto.length() != 0) {
					fch.write(sTexto + "\n");
				}				
			} while(sTexto.length() != 0);
			
			for (int c = 0; c < sTexto.length(); c++) {
				char cLetra = sTexto.charAt(c);
				int ascii = cLetra;
				System.out.println(cLetra + " " + ascii + " " + (cLetra+1) + " " + (char)(cLetra+1));
				fch.write(cLetra + iClave);
			}
			
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");	
		}
		
	}

	private static void escribirFch(File nombreFichero) {

		try {
			FileWriter fch = new FileWriter(nombreFichero);
			String sTexto = "HOLA";
			fch.write(sTexto);
			
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");	
		}
		
	}
	
	private static void introducirDatos(File nombreFichero) {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String sTexto = "";
		
			try {
				FileWriter fch = new FileWriter(nombreFichero);
				
				do {
				System.out.println("Introduzca el texto que desea guardar: ");
				sTexto = teclado.readLine();
				if(sTexto.length() != 0)
							
				fch.write(sTexto + "\n");
				
				} while  (sTexto.length() != 0);
				
				fch.close();
				
			}catch (FileNotFoundException e) {
				System.err.println("Fichero no encontrado");
			} catch (IOException e) {
				System.err.println("Error accediendo al fichero");	
			}
		
	}
	
	private static void leerFch(File nombreFichero) {
		try {
			FileReader fch = new FileReader(nombreFichero);
			
			int ascii;
			
			ascii = fch.read();
			while(ascii != -1) {
				System.out.print((char)ascii);//Castear para que muestre la primera letra en vez de el primer numero
				ascii = fch.read();
			}
			
			
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");	
		}
	}
	
	private static void copiarFch(File nombreFchSoursce, File nombreFchTarget) {
				
		byte bContadorTotal = 0, bContadorVocales = 0, bContadorConsonantes = 0;
		
		try {
			int iCaracter;
				
			FileReader oReadOriginal = new FileReader(nombreFchSoursce);
			FileWriter oWriteOriginal = new FileWriter(nombreFchTarget);
				
			iCaracter = oReadOriginal.read();
				
			while(iCaracter != -1) {
				oWriteOriginal.write((char)iCaracter);
				bContadorTotal++;
				if(Character.isLetter((char)iCaracter) 
						&& iCaracter == 'a' || iCaracter == 'A'
						|| iCaracter == 'e' || iCaracter == 'E'
						|| iCaracter == 'i' || iCaracter == 'I'
						|| iCaracter == 'o' || iCaracter == 'O'
						|| iCaracter == 'u' || iCaracter == 'U') {
					bContadorVocales++;
				} else if (Character.isLetter((char)iCaracter)) {
					bContadorConsonantes++;
				} else if((char)iCaracter == '\n' 
						|| (char)iCaracter == ' ') {
					bContadorTotal--;
				}
				iCaracter = oReadOriginal.read();
			}
				
			oReadOriginal.close();
			oWriteOriginal.close();
			System.out.println("Hay " + bContadorTotal + " caracteres.");
			System.out.println("Hay " + bContadorVocales + " vocales.");
			System.out.println("Hay " + bContadorConsonantes + " consonantes.");
				
		}catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");	
		}	
	}

}

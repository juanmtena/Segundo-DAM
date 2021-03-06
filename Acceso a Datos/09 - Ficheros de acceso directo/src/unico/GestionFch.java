package unico;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import model.Persona;

public class GestionFch {

	private int longReg = 22;//5 caracteres x 2, 5 int y 8 double
	private RandomAccessFile fch;
	
	public GestionFch(String fileName) {
		abrirFichero(fileName);
	}
	
	public void abrirFichero(String fileName) {
		try {
			fch = new RandomAccessFile(fileName, "rw");
		} catch (FileNotFoundException e) {
			System.err.println("El fichero " + fileName + " no existe");
		}
	}
	
	public void cerrarFichero() {
		try {
			fch.close();
		} catch (IOException e) {
			System.err.println("El fichero no puede cerrarse");
		}
	}

	public void escribirRegistro(int numReg, Persona persona) {
		try {
			long posicion = getPosicion(numReg);
			fch.seek(posicion);
			
			//nombre
			String nombre = persona.getNombre();
			char letra;
			for (int i = 0; i < 5; i++) {
				letra = (i < nombre.length()) ? nombre.charAt(i) : ' ';
				fch.writeChar(letra);
			}
			
			//edad
			fch.writeInt(persona.getEdad());
			
			//altura
			fch.writeDouble(persona.getAltura());
			
		} catch (IOException e) {
			System.err.println("El archivo no es accesible");
		}
	}

	private long getPosicion(int numReg) {
		return (numReg-1) * longReg;
	}

	public Persona leerRegistro(int numReg) {
		
		String nombre = "";
		int edad = 0;
		double altura = 0.0;
		
		try {
			long posicion = getPosicion(numReg);
			fch.seek(posicion);
			
			//nombre
			for(int i = 0; i < 5; i++) {
				nombre += fch.readChar();
			}
			
			//edad
			edad = fch.readInt();
			
			//altura
			altura = fch.readDouble();
			
		}catch (IOException e) {
			System.err.println("El archivo no es accesible");
		}
		return new Persona(nombre, edad, altura);
	}
	
}

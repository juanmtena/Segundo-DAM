package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GestionFch {

	private int longReg = 130;
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
	
	public void escribirRegistro(int numReg, Empleado empleado) {
		try {
			long posicion = getPosicion(numReg);
			fch.seek(posicion);
			
			//nombre
			String nombre = empleado.getNombre();
			char letra;
			for (int i = 0; i < 10; i++) {
				letra = (i < nombre.length()) ? nombre.charAt(i) : ' ';
				fch.writeChar(letra);
			}
			
			//apellidos
			String apellidos = empleado.getApellidos();
			char letra2;
			for (int i = 0; i < 20; i++) {
				letra2 = (i < apellidos.length()) ? apellidos.charAt(i) : ' ';
				fch.writeChar(letra2);
			}
			
			//telefono
			fch.writeLong(empleado.getTelefono());
			
			//edad
			fch.writeInt(empleado.getEdad());
			
			//sueldo
			fch.writeDouble(empleado.getSueldo());
			
		} catch (IOException e) {
			System.err.println("El archivo no es accesible");
		}
	}

	private long getPosicion(int numReg) {
		return (numReg-1) * longReg;
	}

	public Empleado leerRegistro(int numReg) {
		
		String nombre = "";
		String apellidos = "";
		long telefono = 0;
		int edad = 0;
		double sueldo = 0.0;
		
		try {
			long posicion = getPosicion(numReg);
			fch.seek(posicion);
			
			//nombre
			char letra;
			for(int i = 0; i < 10; i++) {
				letra = fch.readChar();
				if(letra != ' ') {
					nombre += letra;

				}
			}
			
			//apellidos
			char letra2;
			for(int i = 0; i < 20; i++) {
				letra2 = fch.readChar();
				if(letra2 != ' ') {
					apellidos += letra2;
				}
			}
			
			//telefono
			telefono = fch.readLong();
			
			//edad
			edad = fch.readInt();
			
			//sueldo
			sueldo = fch.readDouble();
			
		}catch (IOException e) {
			System.err.println("El archivo no es accesible");
		}
		return new Empleado(nombre, apellidos, telefono, edad, sueldo);
	}
	
	public void listarTodo() {
		
		try {
			System.out.println(fch.length());
			for(int i = 0; i < fch.length(); i ++) {
				Empleado emp = leerRegistro(i);
				System.out.println(emp);
				;
			}
		} catch (IOException e) {
			System.err.println("Error");
		}		
	} 
	
}

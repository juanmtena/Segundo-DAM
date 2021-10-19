package view;

import java.util.ArrayList;

import model.Coche;
import model.Persona;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 * FICHEROS DE OBJETOS
		 * Class Pojo - definen una estructura de datos (las clases: Persona, Coche...)
		 * implements Serializable
		 * Ejemplo:
		 * 		Clase Alumno {
		 * 			String nombre
		 * 			int curso
		 * 			ArrayList<Nota> notas;
		 * 		}
		 * 
		 * FileOutputStream -> apunta al archivo para escribir
		 * ObjectOutputStream -> buffer sobre el FileOutputStream
		 * writeObject -> escribe un objeto sobre el ObjectOutputStream
		 * --------------------------------------------------------------------------------
		 * FileInputStream -> apunta al archivo para leer
		 * ObjectInputStream -> buffer sobre el FileInputStream
		 * readObject -> lee un objeto del ObjectInputStream
		 * */

		String fileName = "archivos/datos.dat";
		
		escritura(fileName);
		lectura(fileName);
		
	}
	
	private static void escritura(String fileName) {
		
		//Coche c1 = new Coche("Citroen", "C5", 1500);
		//ctrl.GestionFch.escribirObjeto(fileName, c1);
		
		ArrayList<Coche> list = new ArrayList<>();
		list.add(new Coche("Renault", "Clio", 1200));
		list.add(new Coche("Seat", "Ibiza", 1000));
		list.add(new Coche("Nissan", "Qashqai", 1300));
		list.add(new Coche("Renault", "Megane", 1600));
		
		ArrayList<Persona> listPersona = new ArrayList<>();
		list.add(new Coche("Juan Manuel", "Tena Luque", 36));
		list.add(new Coche("Antonio", "Torres", 22));
		list.add(new Coche("Miguel", "Alacid", 22));
		list.add(new Coche("David", "Priego", 25));
		
		ctrl.GestionFch.escribirObjeto(fileName, list, listPersona);
		
		
		System.out.println("Se ha terminado la escritura correctamente");
		
	}
	
	private static void lectura(String fileName) {
	
		//Coche cocheLeido = ctrl.GestionFch.leerObjeto(fileName);
		//System.out.println(cocheLeido);
		
		ArrayList<Coche> list = ctrl.GestionFch.leerArrayObjeto(fileName);
		for(Coche c : list) {
			System.out.println(c);
		}
		
		ArrayList<Persona> listPersona = ctrl.GestionFch.leerArrayObjeto(fileName);
		for(Coche p : listPersona) {
			System.out.println(p);
		}
		
	}


}

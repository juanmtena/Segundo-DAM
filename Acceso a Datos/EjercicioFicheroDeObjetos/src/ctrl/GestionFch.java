package ctrl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import model.Coche;
import model.Persona;

public class GestionFch {

	public static void escribirObjeto(String fileName, Coche c, Persona p) {

		try {
			FileOutputStream fch = new FileOutputStream(fileName);
			ObjectOutputStream buff = new ObjectOutputStream(fch);
			
			buff.writeObject(c);
			buff.writeObject(p);
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR" + fileName + " no existe");
		} catch (IOException e) {
			System.err.println("ERROR no se puede escribir el fichero");
		}
		
	}
	
	public static void escribirObjeto(String fileName, ArrayList<Coche> listado, ArrayList<Persona> listadoPersona) {//Para poder escribir mas de un coche

		try {
			FileOutputStream fch = new FileOutputStream(fileName);
			ObjectOutputStream buff = new ObjectOutputStream(fch);
			
			/*for(Coche c : listado) {
				buff.writeObject(c);
			}*/
			
			buff.writeObject(listado);
			buff.writeObject(listadoPersona);
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR" + fileName + " no existe");
		} catch (IOException e) {
			System.err.println("ERROR no se puede escribir el fichero");
		}
		
	}

	public static Coche leerObjeto(String fileName) {
		Coche c = null;
		Persona p = null;
		
		try {
			FileInputStream fch = new FileInputStream(fileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			c = (Coche) buff.readObject();
			p = (Persona) buff.readObject();
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR" + fileName + " no existe");
		} catch (IOException e) {
			System.err.println("ERROR no se puede leer el fichero");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR el fichero no contiene un coche");
		}
		
		return c;
	}

	public static ArrayList<Coche> leerArrayObjeto(String fileName) {
		ArrayList[] listaObjetos = new ArrayList[2];
		
		ArrayList<Coche> listado = new ArrayList();
		ArrayList<Persona> listadoPersona = new ArrayList();
		
		
		try {
			FileInputStream fch = new FileInputStream(fileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			/*Object obj = buff.readObject();			
			while(obj != null) {
				if(obj instanceof Coche) { //Esto devuelve un boolean e indica si obj es una instancia de Coche
					listado.add((Coche) obj);
				}
				obj = buff.readObject();
			}*/
			
			listado = (ArrayList<Coche>) buff.readObject();
			listadoPersona = (ArrayList<Persona>) buff.readObject();
			
			listaObjetos[0] = listado;
			listaObjetos[1] = listadoPersona;
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR" + fileName + " no existe");
		} catch (IOException e) {
			System.err.println("ERROR no se puede leer el fichero");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR el fichero no contiene un coche");
		}
		
		return listaObjetos;
	}

	
	
}

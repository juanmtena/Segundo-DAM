package ctrl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Coche;

public class GestionFch {

	public static void escribirObjeto(String fileName, Coche c) {

		try {
			FileOutputStream fch = new FileOutputStream(fileName);
			ObjectOutputStream buff = new ObjectOutputStream(fch);
			
			buff.writeObject(c);
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR" + fileName + " no existe");
		} catch (IOException e) {
			System.err.println("ERROR no se puede escribir el fichero");
		}
		
	}
	
	public static void escribirObjeto(String fileName, ArrayList<Coche> listado) {//Para poder escribir mas de un coche

		try {
			FileOutputStream fch = new FileOutputStream(fileName);
			ObjectOutputStream buff = new ObjectOutputStream(fch);
			
			/*for(Coche c : listado) {
				buff.writeObject(c);
			}*/
			
			buff.writeObject(listado);
			
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
		
		try {
			FileInputStream fch = new FileInputStream(fileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			c = (Coche) buff.readObject();
			
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
		
		ArrayList<Coche> listado = new ArrayList();;
		
		try {
			FileInputStream fch = new FileInputStream(fileName);
			ObjectInputStream buff = new ObjectInputStream(fch);
			
			/*Object obj = buff.readObject();			
			while(obj != null) {
				if(obj instanceof Coche) {//Esto devuelve un boolean e indica si obj es una instancia de Coche
					listado.add((Coche) obj);
				}
				obj = buff.readObject();
			}*/
			
			listado = (ArrayList<Coche>) buff.readObject();
			
			buff.close();
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR" + fileName + " no existe");
		} catch (IOException e) {
			System.err.println("ERROR no se puede leer el fichero");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR el fichero no contiene un coche");
		}
		
		return listado;
	}

	
	
}

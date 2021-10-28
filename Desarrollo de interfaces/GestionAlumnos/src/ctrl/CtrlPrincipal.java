package ctrl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

import model.Alumno;

public class CtrlPrincipal {

	private static File oFile;
	public static List<Alumno> persona = new ArrayList<Alumno>();
	
	public static void inicio() {
		
		new view.FrmPrincipal();
		File fichero = new File("contactos.txt");
		
	}
	
	public static void finalizar() {
		
		System.exit(0);
		
	}
	
	public static void leerPersona() {		
		JFileChooser fileChooser = new JFileChooser();
		
		byte opcion = (byte) fileChooser.showOpenDialog(fileChooser);
		
		if(opcion != JFileChooser.CANCEL_OPTION) {
			oFile = fileChooser.getSelectedFile();
			if(oFile != null && !oFile.getName().isEmpty()) {
				try {
					FileReader fch = new FileReader(oFile);
					BufferedReader bufLectura = new BufferedReader(fch);
					
					String lineaLeida;
					lineaLeida = bufLectura.readLine(); 
					
					while(lineaLeida != null) {
						//A continuacion proceso la linea leida...
						StringTokenizer campo = new StringTokenizer(lineaLeida, "#");//Para borrar las almohadillas que haya escrita
						String nombre = campo.nextToken();
						String apellidos = campo.nextToken();
						String talla = campo.nextToken();
						String ciclo = campo.nextToken();
						String turno = campo.nextToken();
						String comentarios = campo.nextToken();
						String sede = campo.nextToken();
						
						persona.add(new Alumno(nombre, apellidos, talla, ciclo, turno, comentarios, sede));
						
						//Realizamos una nueva lectura
						lineaLeida = bufLectura.readLine();
					}
					
					bufLectura.close();
					fch.close();
					
				} catch (FileNotFoundException e) {
					System.err.println("El fichero " + oFile + " no existe");
				} catch (IOException e) {
					System.err.println("Se ha producido un error accediendo a " + oFile);
				}
			}
		}		
	}
	
	public static void mostrarLista() {
		
		String nombre = "";
		DefaultListModel<String> list = new DefaultListModel<String>();
		for(int i = 0; i < persona.size(); i++) {
			nombre = persona.get(i).getNombre();
			list.addElement(nombre);
		}
		view.FrmPrincipal.lista.setModel(list);
	}
	
	public static DefaultListModel modelList(){
		   DefaultListModel model = new DefaultListModel<>();
		   model.addElement("SEVILLA");
		   model.addElement("P.MONTANO");
		   model.addElement("GRANADA");
		   model.addElement("ALMERIA");
		   return model;
		}
	
}

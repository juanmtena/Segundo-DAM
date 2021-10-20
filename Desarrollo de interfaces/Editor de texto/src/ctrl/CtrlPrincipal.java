package ctrl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFileChooser;

public class CtrlPrincipal {
	
	public static File fichero = new File("texto.txt");
	
	public static void inicio() {
		
		new view.FrmPrincipal();
		
	}
	
	public static void finalizar() {
		
		System.exit(0);
		
	}
	
	public static String leer(File fichero) {
		String texto = "";
		try {
			RandomAccessFile fch = new RandomAccessFile(fichero, "r");
			byte[] bytesLeidos = new byte[(int) fch.length()];
			fch.readFully(bytesLeidos);
			texto = new String(bytesLeidos);
			view.FrmPrincipal.txtArea.setText(texto);
			
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero");	
		}
		return texto;
	}
	
	public static void escribir() {
		
		try {
			FileWriter fch = new FileWriter(fichero);
			
			String sTexto = view.FrmPrincipal.txtArea.getText();
			fch.write(sTexto);
			
			fch.close();
			
		} catch (IOException e) {
			System.out.println("ERROR, el fichero no existe");
		}
	}
	
	public static void seleccionarGuardar() {		
		JFileChooser fileChooser = new JFileChooser();
		
		byte opcion = (byte) fileChooser.showSaveDialog(fileChooser);
		
		if(opcion != JFileChooser.CANCEL_OPTION) {
			fichero = fileChooser.getSelectedFile();
			
		}		
	}
	
	public static void seleccionarAbrir() {		
		JFileChooser fileChooser = new JFileChooser();
		
		byte opcion = (byte) fileChooser.showOpenDialog(fileChooser);
		
		if(opcion != JFileChooser.CANCEL_OPTION) {
			fichero = fileChooser.getSelectedFile();
			leer(fichero);
		}	
	}
	
	
}

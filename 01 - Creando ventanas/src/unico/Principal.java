package unico;

import java.awt.Frame;

public class Principal {

	public static void main(String[] args) {

		/*Frame ventana = new Frame(); //Creo una ventana
		
		ventana.setVisible(true); //Para hacerla visible
		
		ventana.setSize(600, 400); //Tama�o de la ventana
		
		ventana.setLocation(100, 100); //Defino la posici�n donde quiero que aparezca
		
		ventana.setBounds(150, 50, 600, 400); //Para darle posici�n y tama�o a la vez
		
		ventana.setTitle("Esto es el t�tulo de mi ventana"); //Para ponerle un t�tulo a la ventana
		
		//Frame ventana2 = new Frame("Titulo directamente al crear el Frame");*/
		
		//test1();
		test2();
	}
	
	private static void test1() {
		
		crearVentana("Primera", 100, 50);
		crearVentana("Segunda", 200, 100);
		crearVentana("Tercera", 400, 200);
		
	}	
	
	private static void crearVentana(String sTitulo, int iAncho, int iAlto) {
				
		Frame ventana = new Frame();
		
	}
	
	private static void test2() {
		
		MiVentana v = new MiVentana();
		
	}

}
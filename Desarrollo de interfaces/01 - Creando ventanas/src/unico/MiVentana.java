package unico;

import java.awt.*;

public class MiVentana extends Frame {

	public MiVentana() {
		
		Color fondoVentana = new Color(99, 194, 67);
		Color textoError = Color.red;
		Color textoNormal = Color.gray;
		
		setTitle("Ejemplo por herencia");
		//setBounds(150, 50, 600, 400);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int ancho = 600;
		int alto = 400;
		int x = (screenSize.width - ancho) / 2;
		int y = (screenSize.height - alto) / 2;
		
		setBounds(x, y, ancho, alto);
		setBackground(fondoVentana); //Color de fondo
		//setForeground(); //Cambiar color del texto
		setVisible(true);//Tiene que inicializarse siempre al final 
	}

}

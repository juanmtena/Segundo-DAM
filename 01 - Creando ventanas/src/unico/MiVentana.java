package unico;

import java.awt.*;

public class MiVentana extends java.awt.Frame {

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
		setVisible(true);
		setBackground(fondoVentana); //Color de fondo
		//setForeground();
		
	}

}

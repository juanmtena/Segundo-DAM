package controller;

import java.awt.Color;

public class CtrlDoble {
	
	public static void finalizarApp() {
		System.exit(0);
	}

	public static void calcularDouble() {

		try {
			String sTexto = view.Doble.txtNumero.getText();
			int iNumero = Integer.parseInt(sTexto);
			view.Doble.lblTexto.setText("El doble es " + iNumero * 2);
			view.Doble.lblTexto.setForeground(Color.black);
		}catch(Exception ex) {
			view.Doble.lblTexto.setText("Error, introduce un numero válido");
			view.Doble.lblTexto.setForeground(view.Theme.MSG_ERROR);
		}
		
		
	}
	
}

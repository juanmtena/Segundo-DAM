package controller;

import java.awt.Color;
import java.awt.Font;

public class CtrlCalculos {
	
	public static void finalizarApp() {
		System.exit(0);
	}

	public static void calcularDouble() {

		try {
			String sTexto = view.Calculos.txtNumero.getText();
			float fNumero = Float.parseFloat(sTexto);
			view.Calculos.lblTexto.setText("El doble es " + fNumero * 2);
			view.Calculos.lblTexto.setForeground(Color.black);
		}catch(Exception ex) {
			view.Calculos.lblTexto.setText("Error, introduce un numero válido");
			view.Calculos.lblTexto.setForeground(view.Theme.MSG_ERROR);
		}		
	}
	
	public static void calcularTriple() {

		try {
			String sTexto = view.Calculos.txtNumero.getText();
			float fNumero = Float.parseFloat(sTexto);
			view.Calculos.lblTexto.setText("El triple es " + fNumero * 3);
			view.Calculos.lblTexto.setForeground(Color.black);
		}catch(Exception ex) {
			view.Calculos.lblTexto.setText("Error, introduce un numero válido");
			view.Calculos.lblTexto.setForeground(view.Theme.MSG_ERROR);
		}		
	}
	
	public static void calcularMitad() {

		try {
			String sTexto = view.Calculos.txtNumero.getText();
			float fNumero = Float.parseFloat(sTexto);
			view.Calculos.lblTexto.setText("La mitad es " + fNumero / 2);
			view.Calculos.lblTexto.setForeground(Color.black);
		}catch(Exception ex) {
			view.Calculos.lblTexto.setText("Error, introduce un numero válido");
			view.Calculos.lblTexto.setForeground(view.Theme.MSG_ERROR);
		}		
	}
	
}

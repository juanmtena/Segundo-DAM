package unico;

import java.awt.*;
import java.awt.event.*;

public class Doble extends java.awt.Frame{
	

	final Color MSG_ERROR = Color.red;
	final Color BTN_CALCULAR = Color.blue;

	public static void main(String[] args) {
		
		Doble doble = new Doble();
		doble.crearVentana();
		doble.crearComponentes();
		
	}
	
	private void crearVentana() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setTitle("Doble");
		setBounds(50, 50, 400, 300);
		setLayout(null);
		setVisible(true);
		
	}
	
	private void crearComponentes() {
		
		Label lblNumero = new Label("Numero:");
		lblNumero.setBounds(100, 80, 50, 20);
		add(lblNumero);
		
		TextField txtNumero = new TextField();
		txtNumero.setBounds(155, 80, 150, 20);
		add(txtNumero);	
		
		Button btnAceptar = new Button("CALCULAR");
		txtNumero.setForeground(Color.white);
		add(btnAceptar);
		
		Label lblTexto =  new Label("Escriba un numero y pulse aceptar");
		lblTexto.setBounds(110, 230, 200, 20);
		lblTexto.setAlignment(Label.CENTER);//Para centrar el texto
		add(lblTexto);
		
		btnAceptar.addActionListener(new ActionListener() {// Para que haga algo al hacer click
			public void actionPerformed(ActionEvent e) {
				try {
					String sTexto = txtNumero.getText();
					int iNumero = Integer.parseInt(sTexto);
					lblTexto.setText("El doble es " + iNumero * 2);
					lblTexto.setForeground(Color.black);
				}catch(Exception ex) {
					lblTexto.setText("Error, introduce un numero válido");
					lblTexto.setForeground(MSG_ERROR);
				}
				
			}
		});
		
		
		
	}

}

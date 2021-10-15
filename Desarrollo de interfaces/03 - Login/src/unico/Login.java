package unico;

import java.awt.*;
import java.awt.event.*;

public class Login extends java.awt.Frame{

	public static void main(String[] args) {

		Login login = new Login();
		login.crearVentana();
		login.crearComponentes();
		
	}
	
	private void crearVentana() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setTitle("Crenado componentes");
		setBounds(50, 50, 600, 400);
		setLayout(null);
		setVisible(true);
		
	}
	
	private void crearComponentes() {
		
		Label lUsuario = new Label("Usuario:");
		lUsuario.setBounds(150, 150, 50, 20);
		add(lUsuario);
		lUsuario.setBackground(Color.green);
		Label lPass = new Label("Contraseña:");
		lPass.setBounds(130, 175, 70, 20);
		add(lPass);
		lPass.setBackground(Color.green);
		TextField tUsuario = new TextField();
		tUsuario.setBounds(205, 150, 250, 20);
		add(tUsuario);
		tUsuario.setBackground(Color.red);
		TextField tPass = new TextField();
		tPass.setBounds(205, 175, 250, 20);
		add(tPass);
		tPass.setBackground(Color.red);
		Button btnAceptar = new Button("ACEPTAR");
		btnAceptar.setBounds(280, 220, 80, 50);
		add(btnAceptar);
		
		
	}

}

package unico;

import java.awt.*;
import java.awt.event.*;

public class MiVentana extends java.awt.Frame{
	
	//COLORES
	final Color CLR_BG_VENTANA = Color.green; 
	
	//FUENTES
	final Font FONT_BTN_NORMAL = new Font("Arial", Font.BOLD, 20);//Pasamos parametros: Tipo de fuente, Aspecto y Tamaño

	public static void main(String[] args) {

		MiVentana myApp = new MiVentana();
		myApp.crearVentana();
		
	}

	public void crearVentana() {
		
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		
		setTitle("Crenado componentes");
		setBounds(50, 50, 600, 400);
		setLayout(null);// El tipo null es para tener total libertad de colocarlo donde quiera
		crearComponentes();
		setVisible(true);

	}

	private void crearComponentes() {
		/*Button btnAceptar = new Button();//Para los botones, le ponemos el prefijo "btn"
		btnAceptar.setLabel("ACEPTAR");
		Button btnAceptar = new Button("ACEPTAR");
		btnAceptar.setBounds(10, 40, 80, 40);
		add(btnAceptar);//Para agregar el componente al Frame
		
		Button btnCancelar = new Button("CANCELAR");
		btnCancelar.setBounds(95, 40, 80, 40);
		add(btnCancelar);*/
		
		/*Button btnSevilla = new Button("SEVILLA");
		btnSevilla.setBounds(10, 40, 80, 40);
		add(btnSevilla);
		Button btnNo = new Button("NO");
		btnNo.setBounds(95, 40, 30, 40);
		add(btnNo);
		Button btnSi = new Button("SI");
		btnSi.setBounds(10, 85, 30, 40);
		add(btnSi);
		Button btnAndalucia = new Button("ANDALUCIA");
		btnAndalucia.setBounds(45, 85, 80, 40);
		add(btnAndalucia);*/
		
		Label lblUsuario = new Label("Usuario:");
		lblUsuario.setBounds(10, 40, 300, 20);
		add(lblUsuario);
		lblUsuario.setBackground(CLR_BG_VENTANA);
		lblUsuario.setForeground(Color.red);
		lblUsuario.setFont(FONT_BTN_NORMAL);
		Label lblPassword = new Label("Password:");
		lblPassword.setBounds(10, 65, 300, 20);
		add(lblPassword);
		lblPassword.setBackground(CLR_BG_VENTANA);
		lblPassword.setForeground(Color.red);
		lblPassword.setFont(FONT_BTN_NORMAL);
		TextField txtUserName = new TextField(10);//Maximo de caracteres
		txtUserName.setBounds(10, 90, 300, 20);
		add(txtUserName);
		txtUserName.setBackground(Color.yellow);
		
	}
	
}

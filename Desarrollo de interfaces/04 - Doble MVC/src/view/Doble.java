package view;

import java.awt.*;
import java.awt.event.*;

public class Doble extends java.awt.Frame{
	
	private static final long serialVersionUID = 1L;
	
	public static TextField txtNumero;
	public static Label lblNumero;
	public static Button btnAceptar;
	public static Label lblTexto;
	
	public Doble() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				controller.CtrlDoble.finalizarApp();
			}
		});
		
		setTitle("Doble");
		setBounds(50, 50, 400, 300);
		setLayout(null);
		setVisible(true);
		
		crearComponentes();
		
	}
	
	private void crearComponentes() {
		
		lblNumero = new Label("Numero:");
		lblNumero.setBounds(100, 80, 50, 20);
		add(lblNumero);
		
		txtNumero = new TextField();
		txtNumero.setBounds(155, 80, 150, 20);
		add(txtNumero);	
		
		btnAceptar = new Button("CALCULAR");
		btnAceptar.setBounds(165, 160, 80, 30);
		txtNumero.setForeground(Color.white);
		add(btnAceptar);
		
		lblTexto =  new Label("Escriba un numero y pulse aceptar");
		lblTexto.setBounds(110, 230, 200, 20);
		lblTexto.setAlignment(Label.CENTER);//Para centrar el texto
		add(lblTexto);
		
		btnAceptar.addActionListener(new ActionListener() {// Para que haga algo al hacer click
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.calcularDouble();				
			}
		});
		
		//Asignamos eventos de
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlDoble.calcularDouble();
			}
		});
		
		//Agregar componentes al Frame
		add(txtNumero);
		add(lblNumero);
		add(btnAceptar);
		add(lblTexto);
		
	}

}

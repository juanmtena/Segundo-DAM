package view;

import java.awt.*;
import java.awt.event.*;

public class Calculos extends java.awt.Frame{
	
	private static final long serialVersionUID = 1L;
	
	public static TextField txtNumero;
	public static Label lblNumero;
	public static Button btnAceptar;
	public static Button btnTriple;
	public static Button btnMitad;
	public static Label lblTexto;
	
	public Calculos() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				controller.CtrlCalculos.finalizarApp();
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
		
		txtNumero = new TextField();
		txtNumero.setBounds(155, 80, 150, 20);
		
		btnAceptar = new Button("DOBLE");
		btnAceptar.setBounds(80, 160, 80, 30);
		
		lblTexto =  new Label("Escriba un numero y pulse aceptar");
		lblTexto.setBounds(110, 230, 200, 20);
		lblTexto.setAlignment(Label.CENTER);//Para centrar el texto
		//lblTexto.setFont("Arial", Font.BOLD, 50);
			
		btnTriple = new Button("TRIPLE");
		btnTriple.setBounds(165, 160, 80, 30);
		
		btnMitad = new Button("MITAD");
		btnMitad.setBounds(250, 160, 80, 30);

		
		//Asignamos eventos de
		btnAceptar.addActionListener(new ActionListener() {// Para que haga algo al hacer click
			public void actionPerformed(ActionEvent e) {
				controller.CtrlCalculos.calcularDouble();
			}
		});
		
		btnTriple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlCalculos.calcularTriple();
			}
		});
		
		btnMitad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlCalculos.calcularMitad();
			}
		});
		
		//Agregar componentes al Frame
		add(txtNumero);
		add(lblNumero);
		add(btnAceptar);
		add(lblTexto);
		add(btnTriple);
		add(btnMitad);
		
	}

}

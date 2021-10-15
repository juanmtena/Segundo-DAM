package view;

import java.awt.event.*;
import java.lang.Thread.State;
import java.awt.*;

public class MiVentana extends Frame{
	
	public static void main(String[] args) {
		MiVentana v = new MiVentana();
		v.crearVentana();
	}
	
	public void crearVentana() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setIconImage(Toolkit.getDefaultToolkit().createImage("logotipo.png"));
		
		setTitle("Crenado Menu");
		setBounds(50, 50, 600, 400);
		setLayout(null);// El tipo null es para tener total libertad de colocarlo donde quiera
		crearComponentes();
		setVisible(true);
		
	}
		
	private void crearComponentes() {
		
		TextArea txtComentarios = new TextArea();
		txtComentarios.setBounds(20, 50, 100, 60);
		
		Label lblFormaPago = new Label("Forma de Pago");
		lblFormaPago.setBounds(140, 50, 100, 20);
		
		CheckboxGroup grpFormaPago = new CheckboxGroup();
		Checkbox opcEfectivo = new Checkbox("Efectivo", true, grpFormaPago);
		opcEfectivo.setBounds(150, 72, 100, 20);
		Checkbox opcTarjeta = new Checkbox("Tarjeta", false, grpFormaPago);
		opcTarjeta.setBounds(150, 94, 100, 20);
		Checkbox opcBizum = new Checkbox("Bizum", false, grpFormaPago);
		opcBizum.setBounds(150, 116, 100, 20);
					
		add(txtComentarios);
		add(lblFormaPago);
		add(opcEfectivo);
		add(opcTarjeta);
		add(opcBizum);
		
		
	}

}

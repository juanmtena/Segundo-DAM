package unico;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MiVentana extends Frame{

	public static void main(String[] args) {

		MiVentana v = new MiVentana();
		v.crearVentana();
		
	}
	
	public void crearVentana() {
		
		setIconImage(Toolkit.getDefaultToolkit().createImage("logotipo2.jpg"));
			
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					int oPpcionSeleccionada = JOptionPane.showConfirmDialog(null, "¿Estás seguro que desea salir?", "SALIR",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					//System.out.println("¿Estás seguro que desea salir? " + oPpcionSeleccionada);
					if(oPpcionSeleccionada < 1) {
						System.exit(0);
					}
					
					
				}
			});
			
			setTitle("Combinando Colores");
			setBounds(50, 50, 300, 300);
			setLayout(null);// El tipo null es para tener total libertad de colocarlo donde quiera
			crearComponentes();
			setVisible(true);
		
	}
	
	private void crearComponentes() {
		
		/*//FONDO
		Panel panelFondo = new Panel();
		panelFondo.setLayout(null);
		panelFondo.setBounds(10, 20, 148, 200);
		Label lblFondo = new Label("FONDO");
		panelFondo.add(lblFondo);
		lblFondo.setBounds(0, 20, 50, 20);
		List lstFondo = new List();		
		lstFondo.add("Rojo");
		lstFondo.add("Azul");
		lstFondo.add("Verde");
		lstFondo.add("Amarillo");
		lstFondo.add("Naranja");
		lstFondo.add("Negro");
		lstFondo.setBounds(10, 45, 100, 100);
		
		panelFondo.add(lstFondo);
		add(panelFondo);
		
		//LETRAS
		Panel panelLetras = new Panel();
		panelLetras.setLayout(null);
		panelLetras.setBounds(150, 20, 148, 200);
		Label lblLetras = new Label("LETRAS");
		panelLetras.add(lblLetras);
		lblLetras.setBounds(10, 20, 50, 20);
		List lstLetras = new List();		
		lstLetras.add("Rojo");
		lstLetras.add("Azul");
		lstLetras.add("Verde");
		lstLetras.add("Amarillo");
		lstLetras.add("Naranja");
		lstLetras.add("Negro");
		lstLetras.setBounds(20, 45, 100, 100);
		
		panelLetras.add(lstLetras);
		add(panelLetras);
		
		Label lblFrase = new Label("SELECCIONA UNA OPCIÓN");
		lblFrase.setBounds(65, 220, 160, 50);
		
		add(lblFrase);
		
		lstFondo.addItemListener (e -> {
			if(lstFondo.getSelectedItem() == "Rojo") {
				lblFrase.setBackground(Color.red);
			} else if(lstFondo.getSelectedItem() == "Azul") {
				lblFrase.setBackground(Color.blue);
			} else if(lstFondo.getSelectedItem() == "Verde") {
				lblFrase.setBackground(Color.green);
			} else if(lstFondo.getSelectedItem() == "Amarillo") {
				lblFrase.setBackground(Color.yellow);
			} else if(lstFondo.getSelectedItem() == "Naranja") {
				lblFrase.setBackground(Color.orange);
			} else if(lstFondo.getSelectedItem() == "Negro") {
				lblFrase.setBackground(Color.black);
			}
		});
		
		lstLetras.addItemListener (e -> {
			if(lstLetras.getSelectedItem() == "Rojo") {
				lblFrase.setForeground(Color.red);
			} else if(lstLetras.getSelectedItem() == "Azul") {
				lblFrase.setForeground(Color.blue);
			} else if(lstLetras.getSelectedItem() == "Verde") {
				lblFrase.setForeground(Color.green);
			} else if(lstLetras.getSelectedItem() == "Amarillo") {
				lblFrase.setForeground(Color.yellow);
			} else if(lstLetras.getSelectedItem() == "Naranja") {
				lblFrase.setForeground(Color.orange);
			} else if(lstLetras.getSelectedItem() == "Negro") {
				lblFrase.setForeground(Color.black);
			}
		});*/
		
		String[] misColores = {"Rojo" , "Azul" , "Verde"};
		JComboBox lstColores = new JComboBox(misColores);
		lstColores.setEditable(true);
		lstColores.setBounds(10, 40, 50, 20); 
		lstColores.addItemListener (e -> {
			System.out.println(lstColores.getSelectedItem());
			System.out.println(lstColores.getSelectedIndex());
		});
		
		add(lstColores);
		
		JButton btnMensaje = new JButton("MENSAJE");
		btnMensaje.setBounds(20, 70, 100, 20);
		btnMensaje.addActionListener (e -> {
			JOptionPane.showMessageDialog(null, "El producto ha sido añadido corretamente", "GESTION DE PRODUCTOS", JOptionPane.ERROR_MESSAGE);
			//JOptionPane.showMessageDialog(null, "no se ha podido eliminar el producto", "GESTION DE PRODUCTOS", JOptionPane.ERROR_MESSAGE);
			
		});
		
		JButton btnEntrada = new JButton("ENTRADA");
		btnEntrada.setBounds(20, 95, 100, 20);
		btnEntrada.addActionListener (e -> {
			String valorIntroducido = JOptionPane.showInputDialog(null, "Introduzca el precio", "100");
			System.out.println("He introducido " + valorIntroducido);
		});
		
		JButton btnConfirmacion = new JButton("CONFIRMACION");
		btnConfirmacion.setBounds(20, 120, 130, 20);
		btnConfirmacion.addActionListener (e -> {
			int oPpcionSeleccionada = JOptionPane.showConfirmDialog(null, "¿Desea formatear el disco duro?", "UTILIDADES DISCO",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			System.out.println("Has seleccionado la opción " + oPpcionSeleccionada);
		});
		
		add(btnMensaje);
		add(btnEntrada);
		add(btnConfirmacion);
		
	}

}

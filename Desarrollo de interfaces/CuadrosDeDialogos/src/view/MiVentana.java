package view;

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
		
		
		
		JButton btnVetana = new JButton("VENTANA");
		btnVetana.setBounds(20, 145, 130, 20);
		btnVetana.addActionListener (e -> {
			
			new FrmProductos();
			
		});
		
		JButton btnConfirmacion = new JButton("CONFIRMACION");
		btnConfirmacion.setBounds(20, 120, 130, 20);
		btnConfirmacion.addActionListener (ex -> {
			int oPpcionSeleccionada = JOptionPane.showConfirmDialog(null, "¿Desea formatear el disco duro?", "UTILIDADES DISCO",  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			System.out.println("Has seleccionado la opción " + oPpcionSeleccionada);
		
		
		});	
		add(btnMensaje);
		add(btnEntrada);
		add(btnConfirmacion);
		add(btnVetana);
	
	}
}	
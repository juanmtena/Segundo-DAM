package view;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class FrmVentana extends JDialog {

	private static final long serialVersionUID = 1L;

	public FrmVentana() {

		setTitle("Gestion de Productos");
		setModal(true);
		setBounds(100, 100, 400, 200);
		addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent we) {
				dispose();
			}
		});
		
		//crearComponentes();
		setVisible(true);
		
	}
	
	private void crearComponentes() {
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.setBounds(10, 50, 80, 20);
		add(btnCrear);
				
	}

	
}

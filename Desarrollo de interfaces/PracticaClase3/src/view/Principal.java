package view;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Principal extends JDialog {

	public static void main(String[] args) {	
		
		Principal v = new Principal();
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
		
		JButton btnVetana = new JButton("VENTANA");
		btnVetana.setBounds(20, 145, 130, 20);
		btnVetana.addActionListener (e -> {
		
		new FrmVentana();
		
	});
	
	add(btnVetana);
		
	}

}

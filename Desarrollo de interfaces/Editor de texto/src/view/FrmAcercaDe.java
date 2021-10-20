package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrmAcercaDe extends JDialog {

	File fichero = new File("acerca_de.txt");
	/**
	 * Create the dialog.
	 */
	public FrmAcercaDe() {
		setTitle("Acerca de");
		setBounds(300, 250, 350, 200);
		getContentPane().setLayout(null);
		setModal(true);
		
		JLabel lblNewLabel = new JLabel(ctrl.CtrlPrincipal.leer(fichero));
		lblNewLabel.setBounds(40, 0, 294, 161);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JLabel lblFoto = new JLabel(new ImageIcon("C:\\Users\\Usuario\\Desktop\\logotipo.png"));
		lblFoto.setBounds(10, 26, 92, 104);
		getContentPane().add(lblFoto);
		setVisible(true);
		
		//JLabel foto = new JLabel(new ImageIcon("C:\\Users\\Usuario\\Desktop\\logotipo.png"));
		
	}
}

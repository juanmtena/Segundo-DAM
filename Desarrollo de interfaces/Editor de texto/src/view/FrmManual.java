package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrmManual extends JDialog {

	File fichero = new File("manual.txt");
	/**
	 * Create the dialog.
	 */
	public FrmManual() {
		setTitle("Manual");
		setBounds(400, 200, 350, 260);
		getContentPane().setLayout(new BorderLayout());
		setModal(true);
		
		JLabel lblNewLabel = new JLabel(ctrl.CtrlPrincipal.leer(fichero));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		setVisible(true);
		
		
		
	}

}

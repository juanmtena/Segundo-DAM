package view;

import java.awt.Image;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
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
		setModal(false);
		
		JLabel lblNewLabel = new JLabel(ctrl.CtrlPrincipal.leer(fichero));
		lblNewLabel.setBounds(40, 0, 294, 161);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JLabel lblFoto = new JLabel();
		lblFoto.setBounds(10, 26, 92, 104);
		ImageIcon imgIcon = new ImageIcon("logotipoEditorDeTexto.png");
		Image imgEscalada = imgIcon.getImage().getScaledInstance(lblFoto.getWidth(),
				lblFoto.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lblFoto.setIcon(iconoEscalado);
		getContentPane().add(lblFoto);
		setVisible(true);		
		
	}
}

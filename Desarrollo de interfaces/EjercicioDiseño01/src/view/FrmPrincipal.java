package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JTextField txtIntroduce;
	public static JLabel lblPalabra;
	public static JLabel lblResultado;

	public static final Color CORRECTO = Color.green;
	public static final Color INCORRECTO = Color.red;
	
	public FrmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\logotipo2.jpg"));
		setTitle("Idiomas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPalabra = new JLabel("");
		lblPalabra.setBackground(Color.WHITE);
		lblPalabra.setBounds(82, 27, 266, 68);
		contentPane.add(lblPalabra);
		
		txtIntroduce = new JTextField();
		txtIntroduce.setToolTipText("");
		txtIntroduce.setBounds(131, 116, 119, 20);
		contentPane.add(txtIntroduce);
		txtIntroduce.setColumns(10);
		
		JButton btnAceptar = new JButton("OK");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.comprobarPalabraEspanol();
			}
		});
		btnAceptar.setBounds(254, 116, 58, 20);
		contentPane.add(btnAceptar);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(148, 161, 147, 33);
		contentPane.add(lblResultado);
		
		setVisible(true);
	}
}

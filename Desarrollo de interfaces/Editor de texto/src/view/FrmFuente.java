package view;

import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FrmFuente extends JDialog {
	
	public static List listFuente;
	public static List listTamano;
	public static JLabel lblTextoPrueba;
	
	public static String[] nombreFuentes;

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public FrmFuente() {
		setModal(true);
		setBounds(400, 200, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblFuente = new JLabel("FUENTE");
		lblFuente.setBounds(50, 21, 46, 14);
		contentPanel.add(lblFuente);
		
		listFuente = new List();
		listFuente.setBounds(29, 46, 85, 109);
		nombreFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(int i = 0; i < nombreFuentes.length; i++) {
			listFuente.add(nombreFuentes[i]);
		}
		listFuente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setFont(new Font(listFuente.getSelectedItem(), Font.PLAIN, 24));
			}
		});
		contentPanel.add(listFuente);
		
		JLabel lblTamano = new JLabel("TAMA\u00D1O");
		lblTamano.setBounds(200, 21, 46, 14);
		contentPanel.add(lblTamano);
		
		listTamano = new List();
		listTamano.setBounds(180, 46, 85, 109);
		for(int i = 12; i < 30; i++) {
			listTamano.add(String.valueOf(i));//Esto hace nuun casting de int a String pq la lista solo acepta un String
		}
		listTamano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setFont(new Font("Tahoma", Font.PLAIN, Integer.parseInt(String.valueOf(listTamano.getSelectedItem()))));
			}
		});
		contentPanel.add(listTamano);
		
		JLabel lblEstilo = new JLabel("ESTILO");
		lblEstilo.setBounds(335, 21, 46, 14);
		contentPanel.add(lblEstilo);
		
		JPanel panelEstilo = new JPanel();
		panelEstilo.setBounds(308, 46, 85, 109);
		contentPanel.add(panelEstilo);
		
		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNormal.isSelected()) {
					lblTextoPrueba.setFont(new Font("Tahoma", Font.PLAIN, 24));
				}
			}
		});
		rdbtnNormal.setSelected(true);
		panelEstilo.add(rdbtnNormal);
		
		JRadioButton rdbtnNegrita = new JRadioButton("Negrita");
		rdbtnNegrita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNegrita.isSelected()) {
					lblTextoPrueba.setFont(new Font("Tahoma", Font.BOLD, 24));
				}
			}
		});
		panelEstilo.add(rdbtnNegrita);
		
		JRadioButton rdbtnCursiva = new JRadioButton("Cursiva");
		rdbtnCursiva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCursiva.isSelected()) {
					lblTextoPrueba.setFont(new Font("Tahoma", Font.ITALIC, 24));
				}
			}
		});
		panelEstilo.add(rdbtnCursiva);
		
		//Para que solo pueda seleccionar un radio button
		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(rdbtnNormal);
		grupoBotones.add(rdbtnNegrita);
		grupoBotones.add(rdbtnCursiva);
		
		lblTextoPrueba = new JLabel("TEXTO DE PRUEBA", JLabel.CENTER);
		lblTextoPrueba.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTextoPrueba.setBounds(0, 166, 434, 45);
		contentPanel.add(lblTextoPrueba);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(79, 222, 89, 23);
		contentPanel.add(btnAceptar);
		
		JButton btnGuardarCambios = new JButton("GUARDAR POR DEFECTO");
		btnGuardarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarCambios.setBounds(180, 222, 180, 23);
		contentPanel.add(btnGuardarCambios);
		setVisible(true);
	}
}

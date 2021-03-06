package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtNombre;
	public static JList lista;
	private final Action action = new SwingAction();

	public FrmPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\logotipo2.jpg"));
		setTitle("Tel\u00E9fonos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(850, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNumeroMostrado = new JLabel("");
		lblNumeroMostrado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNumeroMostrado.setBounds(229, 11, 161, 36);
		contentPane.add(lblNumeroMostrado);
		
		lista = new JList();
		lista.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting() ) {
					int posicion = lista.getSelectedIndex();					
					String telefono = ctrl.CtrlPrincipal.persona.get(posicion).getTelefono();
					lblNumeroMostrado.setText(telefono);
					
					String nombre = ctrl.CtrlPrincipal.persona.get(posicion).getNombre();
					txtNombre.setText(nombre);
					
					String numero = ctrl.CtrlPrincipal.persona.get(posicion).getTelefono();
					txtNumero.setText(numero);
				}
			}
		});
		lista.setBounds(10, 11, 182, 189);
		contentPane.add(lista);
		
		txtNumero = new JTextField();
		txtNumero.setText("N\u00FAmero");
		txtNumero.setBounds(247, 86, 125, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		txtNumero.setVisible(false);
		
		JButton btnGuardarDatos = new JButton("GUARDAR");
		btnGuardarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarDatos.setBounds(247, 128, 125, 23);
		contentPane.add(btnGuardarDatos);
		btnGuardarDatos.setVisible(false);
		
		JButton btnEditarDatos = new JButton("EDITAR");
		btnEditarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setVisible(true);
				txtNumero.setVisible(true);
				btnGuardarDatos.setVisible(true);
			}
		});
		
		btnEditarDatos.setBounds(247, 162, 125, 23);
		contentPane.add(btnEditarDatos);
		
		JButton btnAbrirAgenda = new JButton("ABIR AGENDA");
		btnAbrirAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.leerPersona();
			}
		});
		btnAbrirAgenda.setBounds(20, 211, 172, 29);
		contentPane.add(btnAbrirAgenda);
		
		JButton btnGuardarAgenda = new JButton("GUARDAR AGENDA");
		btnGuardarAgenda.setBounds(229, 211, 172, 29);
		contentPane.add(btnGuardarAgenda);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(247, 55, 125, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setVisible(false);
		
		setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

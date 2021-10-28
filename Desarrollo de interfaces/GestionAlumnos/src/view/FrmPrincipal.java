package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JButton btnGuardar;
	public static JButton btnCancelar;
	public static JButton btnEditar;
	public static JList lista;
	private JTextField txtNombre;
	private JTextField txtApellidos;

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\logotipo.png"));
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				int oPpcionSeleccionada = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir de la aplicación?", "SALIR",  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(oPpcionSeleccionada < 1) {
					ctrl.CtrlPrincipal.finalizar();
				}
			}
		});
		
		setTitle("Gesti\u00F3n de alumnos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 466, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCiclo = new JPanel();
		panelCiclo.setBounds(23, 104, 358, 73);
		contentPane.add(panelCiclo);
		panelCiclo.setLayout(new GridLayout(2, 4, 0, 0));
		
		JLabel lblCiclo = new JLabel("Ciclo:");
		panelCiclo.add(lblCiclo);
		
		JRadioButton rdbtnDAM = new JRadioButton("DAM");
		rdbtnDAM.setSelected(true);
		panelCiclo.add(rdbtnDAM);
		
		JRadioButton rdbtnDAW = new JRadioButton("DAW");
		panelCiclo.add(rdbtnDAW);
		
		JRadioButton rdbtnASIR = new JRadioButton("ASIR");
		panelCiclo.add(rdbtnASIR);
		
		JLabel lblTurno = new JLabel("Turno:");
		panelCiclo.add(lblTurno);
		
		JRadioButton rdbtnManana = new JRadioButton("Ma\u00F1ana");
		rdbtnManana.setSelected(true);
		panelCiclo.add(rdbtnManana);
		
		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		panelCiclo.add(rdbtnTarde);
		
		JRadioButton rdbtnOnline = new JRadioButton("Online");
		panelCiclo.add(rdbtnOnline);
		
		ButtonGroup grupoBotonesCurso = new ButtonGroup();
		grupoBotonesCurso.add(rdbtnDAM);
		grupoBotonesCurso.add(rdbtnDAW);
		grupoBotonesCurso.add(rdbtnASIR);
		ButtonGroup grupoBotonesTurno = new ButtonGroup();
		grupoBotonesTurno.add(rdbtnManana);
		grupoBotonesTurno.add(rdbtnTarde);
		grupoBotonesTurno.add(rdbtnOnline);
		
		JPanel panelComentarios = new JPanel();
		panelComentarios.setBounds(23, 188, 358, 100);
		contentPane.add(panelComentarios);
		panelComentarios.setLayout(null);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		lblComentarios.setBounds(0, 0, 73, 14);
		panelComentarios.add(lblComentarios);
		
		JTextArea textComentarios = new JTextArea();
		textComentarios.setBounds(0, 22, 195, 78);
		panelComentarios.add(textComentarios);
		
		JLabel lblSede = new JLabel("Sede:");
		lblSede.setBounds(234, 0, 46, 14);
		panelComentarios.add(lblSede);
		
		JList listSede = new JList();
		listSede.setBounds(234, 22, 124, 78);
		listSede.setModel(ctrl.CtrlPrincipal.modelList());
		panelComentarios.add(listSede);
		
		JPanel panelReproducir = new JPanel();
		panelReproducir.setBounds(10, 347, 172, 30);
		contentPane.add(panelReproducir);
		panelReproducir.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnPrincipio = new JButton("|<");
		btnPrincipio.setFont(new Font("Tahoma", Font.PLAIN, 7));
		panelReproducir.add(btnPrincipio);
		
		JButton btnAtras = new JButton("<");
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 7));
		panelReproducir.add(btnAtras);
		
		JButton btnAdelante = new JButton(">");
		btnAdelante.setFont(new Font("Tahoma", Font.PLAIN, 7));
		panelReproducir.add(btnAdelante);
		
		JButton btnFialnal = new JButton(">|");
		btnFialnal.setFont(new Font("Tahoma", Font.PLAIN, 7));
		panelReproducir.add(btnFialnal);
		
		JPanel panelBotonoes = new JPanel();
		panelBotonoes.setBounds(185, 347, 255, 30);
		contentPane.add(panelBotonoes);
		panelBotonoes.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCancelar.setVisible(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardar.setVisible(false);
				btnEditar.setVisible(true);
				btnCancelar.setVisible(false);
			}
		});
		panelBotonoes.add(btnCancelar);
		
		
		
		btnEditar = new JButton("EDITAR");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardar.setVisible(true);
				btnEditar.setVisible(true);
				btnCancelar.setVisible(false);
			}
		});
		panelBotonoes.add(btnEditar);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnGuardar.setVisible(false);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.CtrlPrincipal.leerPersona();
				btnGuardar.setVisible(false);
				btnCancelar.setVisible(true);
				btnEditar.setVisible(false);
			}
		});
		panelBotonoes.add(btnGuardar);
		
		JCheckBox chckbxRespEconomico = new JCheckBox("\u00BFEs responsable econ\u00F3mico?");
		chckbxRespEconomico.setSelected(true);
		chckbxRespEconomico.setBounds(23, 302, 168, 23);
		contentPane.add(chckbxRespEconomico);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 11, 358, 82);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(0, 11, 46, 14);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(98, 8, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(0, 57, 46, 14);
		panel.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(98, 54, 86, 20);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblTalla = new JLabel("Talla:");
		lblTalla.setBounds(230, 11, 46, 14);
		panel.add(lblTalla);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(312, 8, 46, 20);
		panel.add(spinner);
		
		JPanel panelColor = new JPanel();
		panelColor.setBackground(Color.GRAY);
		panelColor.setBounds(0, 332, 450, 56);
		contentPane.add(panelColor);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(451, 330, -451, 2);
		contentPane.add(separator);
		
		setVisible(true);
	}
}

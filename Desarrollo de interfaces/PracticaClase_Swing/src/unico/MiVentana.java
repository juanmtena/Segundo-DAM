package unico;

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
				System.exit(0);
			}
		});
		
		setTitle("Ficha alumno");
		setBounds(50, 50, 300, 350);
		setLayout(null);// El tipo null es para tener total libertad de colocarlo donde quiera
		crearComponentes();
		setVisible(true);
		
	}

	private void crearComponentes() {
		
		//NOMBRE Y APELLIDOS
		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(2, 2));
		panelDatos.setBounds(10, 50, 280, 40);
		
		JLabel lblNombre = new JLabel("Nombre:");
		//lblNombre.setBackground(Color.red);
		JLabel lblApellidos = new JLabel("Apellidos:");
		//lblApellidos.setBackground(Color.red);
		JTextField txtNombre = new JTextField();
		//txtNombre.setBackground(Color.red);
		JTextField txtApellidos = new JTextField();
		//txtApellidos.setBackground(Color.red);
		
		//CURSO
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(0, 0, 50, 20);
		JPanel panelCurso = new JPanel();
		panelCurso.setLayout(null);
		panelCurso.setBounds(10, 105, 140, 170);
		
		CheckboxGroup checkCurso = new CheckboxGroup();
		Checkbox opcDAM = new Checkbox("DAM", true, checkCurso);
		opcDAM.setBounds(10, 25, 100, 20);
		Checkbox opcDAW = new Checkbox("DAW", false, checkCurso);
		opcDAW.setBounds(10, 50, 100, 20);
		Checkbox opcASIR = new Checkbox("ASIR", false, checkCurso);
		opcASIR.setBounds(10, 75, 100, 20);
		
		//TURNO
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(0, 0, 50, 20);
		JPanel panelTurno = new JPanel();
		panelTurno.setLayout(null);
		panelTurno.setBounds(150, 105, 140, 170);
		
		CheckboxGroup checkTurno = new CheckboxGroup();
		Checkbox opcManana = new Checkbox("Mañana", true, checkCurso);
		opcManana.setBounds(10, 25, 100, 20);
		Checkbox opcTarde = new Checkbox("Tarde", false, checkCurso);
		opcTarde.setBounds(10, 50, 100, 20);
		
		//FRASE
		Checkbox chkFrase = new Checkbox("Es responsable econmico", false);
		chkFrase.setBounds(20, 300, 300, 20);
		
		panelDatos.add(lblNombre);
		panelDatos.add(txtNombre);
		panelDatos.add(lblApellidos);
		panelDatos.add(txtApellidos);
		
		panelCurso.add(lblCurso);
		panelCurso.add(opcDAM);
		panelCurso.add(opcDAW);
		panelCurso.add(opcASIR);
		
		panelTurno.add(lblTurno);
		panelTurno.add(opcManana);
		panelTurno.add(opcTarde);	
		
		add(panelDatos);
		add(panelCurso);
		add(panelTurno);
		add(chkFrase);
	}
		
}

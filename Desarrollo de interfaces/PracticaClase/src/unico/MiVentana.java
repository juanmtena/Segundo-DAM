package unico;

import java.awt.*;
import java.awt.event.*;

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
		Panel panelDatos = new Panel();
		panelDatos.setLayout(null);
		panelDatos.setBounds(10, 50, 280, 40);
		panelDatos.setBackground(Color.green);
		
		Label lblNombre = new Label("Nombre:");
		//lblNombre.setBackground(Color.red);
		Label lblApellidos = new Label("Apellidos:");
		//lblApellidos.setBackground(Color.red);
		TextField txtNombre = new TextField();
		//txtNombre.setBackground(Color.red);
		TextField txtApellidos = new TextField();
		//txtApellidos.setBackground(Color.red);
		
		//CURSO
		Label lblCurso = new Label("Curso");
		lblCurso.setBounds(0, 0, 50, 20);
		Panel panelCurso = new Panel();
		panelCurso.setLayout(null);
		panelCurso.setBounds(10, 105, 140, 100);
		
		CheckboxGroup checkCurso = new CheckboxGroup();
		Checkbox opcDAM = new Checkbox("DAM", true, checkCurso);
		opcDAM.setBounds(20, 25, 100, 20);
		Checkbox opcDAW = new Checkbox("DAW", false, checkCurso);
		opcDAW.setBounds(20, 50, 100, 20);
		Checkbox opcASIR = new Checkbox("ASIR", false, checkCurso);
		opcASIR.setBounds(20, 75, 100, 20);
		
		//TURNO
		Label lblTurno = new Label("Turno");
		lblTurno.setBounds(0, 0, 50, 20);
		Panel panelTurno = new Panel();
		panelTurno.setLayout(null);
		panelTurno.setBounds(150, 105, 140, 100);
		
		CheckboxGroup checkTurno = new CheckboxGroup();
		Checkbox opcManana = new Checkbox("Mañana", true, checkCurso);
		opcManana.setBounds(20, 25, 100, 20);
		Checkbox opcTarde = new Checkbox("Tarde", false, checkCurso);
		opcTarde.setBounds(20, 50, 100, 20);
		
		/*//FRASE
		Checkbox chkFrase = new Checkbox("Es responsable econmico", false);
		chkFrase.setBounds(20, 300, 300, 20);*/
		
		//LISTA CIUDADES
		List lstCiudades = new List();
		lstCiudades.add("Sevilla");
		lstCiudades.add("Córdoba");
		lstCiudades.add("Huelva");
		lstCiudades.add("Granada");
		lstCiudades.add("Málaga");
		lstCiudades.add("Cadiz");		
		lstCiudades.setBounds(10, 250, 80, 50);
		
		//LISTA DESPLEGABLE CICLOS
		Choice lstCiclos = new Choice();
		lstCiclos.add("DAM");
		lstCiclos.add("DAW");
		lstCiclos.add("ASIR");
		lstCiclos.add("GAMED");
		lstCiclos.setBounds(100, 250, 80, 50);		

		/*lstCiudades.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(lstCiudades.getSelectedItem());
			}
		});*/
		
		//FUNCION LAMBDA IGUAL QUE LA DE ARRIBA
		lstCiudades.addItemListener (e -> {
			System.out.println(lstCiudades.getSelectedItem());
		});
		
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
		//add(chkFrase);
		add(lstCiudades);
		add(lstCiclos);
	}
		
}

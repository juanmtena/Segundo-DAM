package unico;

import java.awt.*;
import java.awt.event.*;

public class MiVentana extends java.awt.Frame{
	
	//COLORES
	final Color CLR_BG_VENTANA = Color.green; 
	
	//FUENTES
	final Font FONT_BTN_NORMAL = new Font("Arial", Font.BOLD, 20);//Pasamos parametros: Tipo de fuente, Aspecto y Tamaño

	public static void main(String[] args) {

		MiVentana myApp = new MiVentana();
		myApp.crearVentana();
		
	}

	public void crearVentana() {
		
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		
		setTitle("Crenado componentes");
		setBounds(50, 50, 600, 400);
		//setLayout(null);
		//setLayout(new FlowLayout());//LOS COMPONENTES SE ADAPTAN AL TAMAÑO DE LA VENTANA, IMPORATANTE EL ORDEN QUE LOS PONEMOS
		//setLayout(new BorderLayout());//SOLO NOS PERMITE 5 COMPONENTES(NORTH, SOUTH, EAST, WEST, CENTER)
		//setLayout(new GridLayout(2, 3));//SE PONEN POR FILAS Y COLUMNAS(F, C)
		
		crearComponentes();
		setVisible(true);

	}

	private void crearComponentes() {
		
		Panel panOperaciones = new Panel();
		panOperaciones.setLayout(new GridLayout(2, 2));
		Panel panOperaciones2 = new Panel();
		panOperaciones2.setLayout(new FlowLayout());
		
		Label lUsuario = new Label("Usuario:");
		panOperaciones.add(lUsuario);
		TextField tUsuario = new TextField();
		panOperaciones.add(tUsuario);
		Label lPass = new Label("Contraseña:");
		panOperaciones.add(lPass);		
		TextField tPass = new TextField();
		panOperaciones.add(tPass);
		Button btnAceptar = new Button("ACEPTAR");
		panOperaciones2.add(btnAceptar);
		
		add(panOperaciones, BorderLayout.CENTER);
		add(panOperaciones2, BorderLayout.CENTER);
		
	}
		
	
}

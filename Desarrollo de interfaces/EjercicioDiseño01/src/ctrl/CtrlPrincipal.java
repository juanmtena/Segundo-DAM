package ctrl;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CtrlPrincipal extends JFrame {

	public static int numPreg;
	
	public static void inicio() {
		
		new view.FrmPrincipal();
		model.Lenguajes.cargarLenguajes();
		rellenarPregunta();
		
	}
	
	public static void generarNumPregunta() {
		numPreg = (int)Math.floor(Math.random()*(model.Lenguajes.ingles.size()-1+0)+0);
		//numPreg = 1;
	}
	
	public static void rellenarPregunta() {
		generarNumPregunta();
		String pregunta = model.Lenguajes.ingles.get(numPreg);
		view.FrmPrincipal.lblPalabra.setText(pregunta);
	}
	
	public static void quitarPalabraListado() {
		model.Lenguajes.ingles.remove(numPreg);
		model.Lenguajes.espanol.remove(numPreg);
	}
	
	
	
	public static void comprobarPalabraEspanol() {
		String busqueda = view.FrmPrincipal.txtIntroduce.getText();
		if (model.Lenguajes.espanol.get(numPreg).toUpperCase().equals(busqueda.toUpperCase())) {
			view.FrmPrincipal.lblResultado.setText("CORRECTO");
			view.FrmPrincipal.lblResultado.setForeground(view.FrmPrincipal.CORRECTO);
		} else {
			view.FrmPrincipal.lblResultado.setText("INCORRECTO");
			view.FrmPrincipal.lblResultado.setForeground(view.FrmPrincipal.INCORRECTO);
		}
		rellenarPregunta();
		quitarPalabraListado();
		todasPalabrasAcertadas();
	}
	
	public static void todasPalabrasAcertadas() {
		if(model.Lenguajes.ingles.isEmpty()) {
			int oPpcionSeleccionada = JOptionPane.showConfirmDialog(null, "?Est?s seguro que desea salir?", "SALIR",  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(oPpcionSeleccionada < 1) {
				System.exit(0);
			} else {
				model.Lenguajes.cargarLenguajes();
			}
		}
			
	}
	
	
}

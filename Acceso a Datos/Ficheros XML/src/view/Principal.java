package view;


import controller.GestionFicherosXML;
import model.Jugador;

public class Principal {

	public static void main(String[] args) {
		
		String fileName = "archivos/datos.xml";
		
		GestionFicherosXML fchXML = new GestionFicherosXML(fileName);//Cargamos en memoria el documento
		
		fchXML.addJugador(new Jugador(1122, "Mario", "Fernan Feria", "Dado", 145));
		
		fchXML.mostrarDocumento();
		
		fchXML.savData();
		
		//System.out.println(fchXML.getJugadores());
	}

}

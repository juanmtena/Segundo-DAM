package model;

import java.util.ArrayList;

public class Provincia {

	private String ccaa;
	private int id;
	private String nombreProvincia;
	private ArrayList<Ciudad> ciudades;
	
	public Provincia(String ccaa, int id, String nombreProvincia, ArrayList<Ciudad> ciudades) {
		
		this.id = id;
		this.ccaa = ccaa;
		this.nombreProvincia = nombreProvincia;
		this.ciudades = ciudades;
	}

	public Provincia() {
		
		this.id = 0;
		this.ccaa = "";
		this.nombreProvincia = "";
		this.ciudades = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCcaa() {
		return ccaa;
	}

	public void setCcaa(String ccaa) {
		this.ccaa = ccaa;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	@Override
	public String toString() {
		return "Provincia [ccaa=" + ccaa + ", id=" + id + ", nombreProvincia=" + nombreProvincia + ", ciudades="
				+ ciudades + "]";
	}
	
}

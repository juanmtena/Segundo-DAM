package model;

import java.util.ArrayList;

public class CCAA {

	private String id;
	private String nombreCcAa;
	private ArrayList<Provincia> provincias;
	
	public CCAA(String id, String nombreCcAa, ArrayList<Provincia> provincias) {
		
		this.id = id;
		this.nombreCcAa = nombreCcAa;
		this.provincias = provincias;
	}

	public CCAA() {
		
		this.id = "";
		this.nombreCcAa = "";
		this.provincias = null;
	}

	public String getCcaa() {
		return id;
	}

	public void setCcaa(String id) {
		this.id = id;
	}

	public String getNombreCcAa() {
		return nombreCcAa;
	}

	public void setNombreCcAa(String nombreCcAa) {
		this.nombreCcAa = nombreCcAa;
	}

	public ArrayList<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(ArrayList<Provincia> provincias) {
		this.provincias = provincias;
	}

	@Override
	public String toString() {
		return "CCAA [ccaa=" + id + ", nombreCcAa=" + nombreCcAa + ", provincias=" + provincias + "]";
	}
	
}

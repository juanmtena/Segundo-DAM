package model;

public class Ciudad {

	private int codigo;
	private String nombreCiudad;
	private int tMax;
	private int tMin;
	
	public Ciudad(int codigo, String nombreCiudad, int tMax, int tMin) {
		
		this.codigo = codigo;
		this.nombreCiudad = nombreCiudad;
		this.tMax = tMax;
		this.tMin = tMin;
	}

	public Ciudad() {
		
		this.codigo = 0;
		this.nombreCiudad = "";
		this.tMax = 0;
		this.tMin = 0;		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getnombreCiudad() {
		return nombreCiudad;
	}

	public void setnombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public int gettMax() {
		return tMax;
	}

	public void settMax(int tMax) {
		this.tMax = tMax;
	}

	public int gettMin() {
		return tMin;
	}

	public void settMin(int tMin) {
		this.tMin = tMin;
	}

	@Override
	public String toString() {
		return "Ciudad [codigo=" + codigo + ", nombreCiudad=" + nombreCiudad + ", tMax=" + tMax + ", tMin=" + tMin
				+ "]";
	}

	
	
}

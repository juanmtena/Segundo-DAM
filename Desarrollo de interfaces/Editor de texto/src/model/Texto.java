package model;

public class Texto {

	String texto;

	public Texto(String texto) {
		
		this.texto = texto;
	}

	public Texto() {
		
		this.texto = "";
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Texto [texto=" + texto + "]";
	}
	
}

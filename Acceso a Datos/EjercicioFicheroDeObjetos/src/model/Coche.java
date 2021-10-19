package model;

import java.io.Serializable;

public class Coche implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String marca;
	private String modelo;
	private int potencia;
	
	public Coche(String marca, String modelo, int potencia) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public Coche() {
		
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + "]";
	}
	
}

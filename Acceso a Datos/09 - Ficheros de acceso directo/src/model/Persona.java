package model;

public class Persona {

	private String nombre;
	private int edad;
	private double altura;
	
	public Persona(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.altura = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + " a?os, altura=" + altura + " cm5]";
	}
	
	
}

package model;

public class Empleado {

	String nombre;
	String apellidos;
	long telefono;
	String email;
	int edad;
	double sueldo;
	
	public Empleado(String nombre, String apellidos, long telefono, String email,int edad, double sueldo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public Empleado() {
		this.nombre = "";
		this.apellidos = "";
		this.telefono = 0;
		this.email = "";
		this.edad = 0;
		this.sueldo = 0.0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public long getTelefono() {
		return telefono;
	}
	
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + ", edad=" + edad
				+ ", sueldo=" + sueldo + "]";
	}
	
}

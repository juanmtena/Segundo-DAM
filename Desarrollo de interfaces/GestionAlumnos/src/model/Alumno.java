package model;

public class Alumno {
	
	String nombre;
	String apellidos;
	String talla;
	String ciclo;
	String turno;
	String comentarios;
	String sede;
	
	

	public Alumno(String nombre, String apellidos, String talla, String ciclo, String turno, String comentarios,
			String sede) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.talla = talla;
		this.ciclo = ciclo;
		this.turno = turno;
		this.comentarios = comentarios;
		this.sede = sede;
	}

	public Alumno() {
		
		this.nombre = "";
		this.apellidos = "";
		this.talla = "";
		this.ciclo = "";
		this.turno = "";
		this.comentarios = "";
		this.sede = "";
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

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", talla=" + talla + ", ciclo=" + ciclo
				+ ", turno=" + turno + ", comentarios=" + comentarios + ", sede=" + sede + "]";
	}

}

package model;

public class Jugador {

	private int numero;
	private String nombre;
	private String apellidos;
	private String nick;
	private int puntos;
	
	public Jugador(int numero, String nombre, String apellidos, String nick, int puntos) {
		
		this.numero = numero;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nick = nick;
		this.puntos = puntos;
	}

	public Jugador() {
		
		this.numero = 0;
		this.nombre = "";
		this.apellidos = "";
		this.nick = "";
		this.puntos = 0;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		
		String mensaje;
		
		mensaje = "\nJugador numero: " + numero + ", nombre: " + nombre + ", apellidos: " + apellidos + ", nick: " + nick
				+ ", puntos: " + puntos;
		
		return mensaje;
	}
	
	
	
}

package model;

public class Partida {

	int numero;
	int duracion;
	Jugador jugador1;
	Jugador jugador2;
	
	public Partida(int numero, int duracion, Jugador jugador1, Jugador jugador2) {
		
		this.numero = numero;
		this.duracion = duracion;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public Partida() {
		
		this.numero = 0;
		this.duracion = 0;
		this.jugador1 = null;
		this.jugador2 = null;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	@Override
	public String toString() {
		return "Partida [numero=" + numero + ", duracion=" + duracion + ", jugador1=" + jugador1 + ", jugador2=" + jugador2 + "]";
	}
	
	
	
}

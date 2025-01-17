package edu.alonso.examen;

public class Mutante extends Superheroe{
	private int nivelMutacion;
	
	public Mutante(String nombre, String poder, String universo, int nivelMutacion) {
		super(nombre, poder, universo);
		this.nivelMutacion = nivelMutacion;
	}
	
	public int getNivelMutacion() {
		return nivelMutacion;
	}
	
	public void setNivelMutacion(int nivelMutacion) {
		this.nivelMutacion = nivelMutacion;
	}
	
	@Override
	public void usarPoder() {
		System.out.println("El Mutante " + getNombre() + " usa su habilidad mutante de nivel " + nivelMutacion);
	}
	
	
	@Override
	public String toString() {
		return "Mutante: " + super.toString() + ", nivel de mutacion = " + nivelMutacion;
	}
}

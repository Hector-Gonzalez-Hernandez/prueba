package edu.alonso.examen;

public class Superheroe {
	private String nombre;
	private String poder;
	private String universo;
	
	public Superheroe(String nombre, String poder, String universo) {
		this.nombre = nombre;
		this.poder = poder;
		this.universo = universo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPoder() {
		return poder;
	}
	
	public String getUniverso() {
		return universo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	public void setUniverso(String universo) {
		this.universo = universo;
	}
	
	public void usarPoder() {
		System.out.println("El superheroe " + nombre + " esta usando " + poder);
	}
	
	@Override
	public String toString() {
		return "Nombre = " + nombre + ", poder = " + poder + ", universo = " + universo;
	}
}

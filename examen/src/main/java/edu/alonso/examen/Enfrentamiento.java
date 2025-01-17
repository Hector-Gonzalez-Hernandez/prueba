package edu.alonso.examen;

import java.util.Random;

public class Enfrentamiento {
	private final int VIDA_INICIAL = 10;
	
	private Random r = new Random();
	
	public Enfrentamiento(Superheroe primero, Superheroe segundo) {
		int vidaPrimero = VIDA_INICIAL;
		int vidaSegundo = VIDA_INICIAL;
		int dado;
		String ganador = "";
		
		for (int turno = 1;vidaPrimero > 0 && vidaSegundo > 0;turno++) {
			
			System.out.println("Turno " + turno);
			
			System.out.println(" ");
			
			dado = r.nextInt(6)+1;
			if (dado%2 == 0) {
				System.out.println(primero.getNombre() + " inflinge " + dado + " de ataque");
				vidaSegundo-=dado;
			} else if (vidaPrimero+dado<=VIDA_INICIAL){
				System.out.println(primero.getNombre() + " se cura " + dado + " de vida");
				vidaPrimero+=dado;
			} else {
				System.out.println(primero.getNombre() + " no se puede curar");
			}
			dado = r.nextInt(6)+1;
			if (dado%2 == 0) {
				System.out.println(segundo.getNombre() + " inflinge " + dado + " de ataque");
				vidaPrimero-=dado;
			} else if (vidaSegundo+dado<=VIDA_INICIAL){
				System.out.println(segundo.getNombre() + " se cura " + dado + " de vida");
				vidaSegundo+=dado;
			} else {
				System.out.println(segundo.getNombre() + " no se puede curar");
			}
			System.out.println("La vida de " + primero.getNombre() + " es " + vidaPrimero);
			System.out.println("La vida de " + segundo.getNombre() + " es " + vidaSegundo);
			System.out.println(" ");
		}
		if (vidaPrimero>vidaSegundo) {
			ganador = primero.getNombre();
		} else {
			ganador = segundo.getNombre();
		}
		System.out.println("El ganador es "+ ganador);
	}
}

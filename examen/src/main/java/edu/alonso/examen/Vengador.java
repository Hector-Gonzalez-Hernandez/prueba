package edu.alonso.examen;

public class Vengador extends Superheroe{
	private String armadura;
	
	public Vengador(String nombre, String poder, String universo, String armadura) {
		super(nombre, poder, universo);
		this.armadura = armadura;
	}
	
	public String getArmadura() {
		return armadura;
	}
	
	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}
	
	public void mostrarLogoVengadores(int altura) {
		if (altura%2!=0 && altura>=5) {
			for (int espaciosPrimigenios = altura-1;espaciosPrimigenios>0;espaciosPrimigenios--) {
				System.out.print(" ");
			}
			System.out.println("*");
			for(int filas = 1;filas<(altura/2);filas++) {
				for(int espacios = altura-filas-1;espacios>0;espacios--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int columnas = 0;columnas<(filas*2)-1;columnas++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			for (int espaciosLinea = altura/2;espaciosLinea>0;espaciosLinea--) {
				System.out.print(" ");
			}
			for (int asteriscosLinea = altura;asteriscosLinea>0;asteriscosLinea--) {
				System.out.print("*");
			}
			System.out.println();
			for (int filas2 = 1;filas2<(altura/2)+1;filas2++) {
				for (int espacios2 = (altura/2)-filas2;espacios2>0;espacios2--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int columnas2 = 1;columnas2<(altura +((filas2*2)-1));columnas2++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		} else {
			System.out.println("El número introducido no es impar y mayor o igual a 5");
		}
	}
	
	@Override
	public void usarPoder() {
		System.out.println("El Vengador " + getNombre() + " usa su poder especial " + getPoder());
	}
	
	@Override
	public String toString() {
		return "Vengador: " + super.toString() + ", armadura = " + armadura;
	}
}

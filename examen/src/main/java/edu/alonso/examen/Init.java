package edu.alonso.examen;

public class Init {
	public static void main(String[] args) {
		Mutante lobezno = new Mutante("Lobezno", "Inmortalidad", "Marvel", 3);
		Vengador thor = new Vengador("Thor","Rayo","Marvel","armadura asgardiana");
		Superheroe superman = new Superheroe("Superman", "Superfuerza", "DC");
		
		superman.usarPoder();
		
		System.out.println();
		
		thor.usarPoder();
		
		System.out.println();
		
		lobezno.usarPoder();
		
		System.out.println();
		
		System.out.println(lobezno);
		
		System.out.println();
		
		System.out.println(thor);
		
		System.out.println();
		
		thor.mostrarLogoVengadores(15);
		
		System.out.println();
		
		System.out.println(superman);
		
		System.out.println();
		
		Enfrentamiento primero = new Enfrentamiento(thor, superman);
	}
}

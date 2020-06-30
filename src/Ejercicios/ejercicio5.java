package Ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		float participacion , exam1 , exam2 , finalExa , total;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Digite nombre del alumno");
		var nombre = s.nextLine();
		System.out.println("Digite su nota de participación");
		participacion = s.nextFloat();		
		System.out.println("Digite su nota del primer examen");
		exam1 = s.nextFloat();
		System.out.println("Digite su nota del segundo examen");
		exam2  = s.nextFloat();
		
		System.out.println("Digite su nota del examen final");
		finalExa = s.nextFloat();
		
		participacion *= 0.10f;
		exam1  *= 0.25f;
		exam2 *= 0.25f;
		finalExa *=0.40f;
		
		total = participacion + exam1 + exam2 + finalExa;
		
		System.out.println("\nEl alumn@ ".concat(nombre) + " tiene un promedio final de " + total);
		
		
	}
}

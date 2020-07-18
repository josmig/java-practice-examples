package Fundamentos.Ejercicios;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {

        int horas , dias , semanas ,horas_totales;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar el numero total de horas");
        horas_totales = s.nextInt();

        //con esto cuantas semanas hay exactamente
        semanas = horas_totales / 168;
        //el residuo de las semanas en 24/ horas al dia
        dias = horas_totales % 168 / 24;
        //
        horas =  horas_totales %24;

        System.out.println("\nEl equivalente es");
        System.out.println("Semanas : " + semanas);
        System.out.println("Dias : " + dias);
        System.out.println("Horas : " + horas);


    }
}

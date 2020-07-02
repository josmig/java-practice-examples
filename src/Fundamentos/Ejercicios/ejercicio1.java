package Fundamentos.Ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //Hacer un programa que calcule e imprima las tres calificaciones
        System.out.println("Ingresa las calificaciones");
        Scanner s = new Scanner(System.in);
        float num1 , num2,num3;
        System.out.println("NUM 1 :");
        num1 = s.nextFloat();
        System.out.println("NUM 2 :");
        num2=s.nextFloat();
        System.out.println("NUM 3 :");
        num3=s.nextFloat();

        float suma = num1 + num2 + num3;
        System.out.println("\nEl resultado del calculo es : " + suma);
    }
}

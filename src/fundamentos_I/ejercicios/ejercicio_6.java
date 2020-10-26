package fundamentos_I.ejercicios;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        System.out.println("Ingrese los numeros para la operacion");
        Scanner sc = new Scanner(System.in);
        double a ,b , result;
        a = sc.nextInt();
        b = sc.nextInt();

        result = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);
        System.out.println("El resultado es " + result);

    }
}

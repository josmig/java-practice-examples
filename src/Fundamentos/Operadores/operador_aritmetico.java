package Fundamentos.Operadores;

import java.util.Scanner;

public class operador_aritmetico {
    public static void main(String[] args) {
        System.out.println("Ingresa dos numeros para hacer las operaciones mas conocidas : ");
        Scanner s = new Scanner(System.in);
        float numero1,numero2 ,suma,resta,multiplicacion,division,modulo;

        numero1 = s.nextFloat();
        numero2 = s.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo = numero1 % numero2; //el residuo de la division

        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("La multiplicación : " + multiplicacion);
        System.out.println("La division : " + division);
        System.out.println("El resto de la division es :" + modulo);
    }
}

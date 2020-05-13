package Fundamentos_Programacion;

import java.util.Scanner;

public class entrada_salida_datos_2 {
    public static void main(String[] args) {

        System.out.println("Ingrese un numero para la obtención de datos");
        Scanner scanner = new Scanner(System.in);
        float numero;
        numero = scanner.nextFloat();

        System.out.println("El numero es : " + numero);



    }
}

package fundamentos_I;

import java.util.Scanner;

public class entrada_y_salida_datos {
	
	public static void main(String[] args) {
        System.out.println("Ingrese un numero para la obtención de datos");
        Scanner scanner = new Scanner(System.in);
        float numero;
        numero = scanner.nextFloat();

        System.out.println("Digite un caracter");
        char caracter;
        caracter = scanner.next().charAt(0);

        System.out.println("El numero es : " + numero);
        System.out.println("La cadena en la pocisíón es : " + caracter);
        
        scanner.close();
    }
}

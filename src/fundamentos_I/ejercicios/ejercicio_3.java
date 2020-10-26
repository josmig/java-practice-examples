package fundamentos_I.ejercicios;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        //Guillermno tiene N dolares . Luis la mitad de guillermo y juan la mitad delo que tienen Guillermo y luis
        // imprimir la cantidad de dinero que tienen entre los 3
        int guille,luis,juan;

        Scanner s = new Scanner(System.in);
        System.out.print("Guillermo tiene : ");
        guille= s.nextInt();


        luis = guille / 2;
        juan = (guille + luis) / 2;

        int total = guille + luis + juan;

        System.out.println("Guillermo tiene: " + "$"+guille + ", Luis tiene: " + "$"+luis+ " Y Juan tiene: " +
                "$"+juan);

        System.out.println("El dinero total entre los 3 es de : " +"$"+total);
    }
}

package fundamentos_I.ejercicios;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        String mes;
        String nombre;
        int salario = 1000 , comision_carrosvendidos;
        float valor = 5,costecarro;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite al vendedor");
        nombre = s.nextLine();
        System.out.println("Digite precio del carro");
        costecarro=s.nextFloat();
        System.out.println("Digite total de carros comprados");
        comision_carrosvendidos = s.nextInt();

        var salario_total = salario + (comision_carrosvendidos * 150) + (0.05f*costecarro*comision_carrosvendidos);
        System.out.println(nombre.concat(" Gana un salario de ") + salario_total);
    }
}

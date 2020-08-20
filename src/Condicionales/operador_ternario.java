package Condicionales;

import javax.swing.*;

public class operador_ternario {
    public static void main(String[] args) {
        int numero;
        String mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        mensaje = (numero % 2 == 0)  ? "Es par" : "Es impar";
        System.out.println(mensaje);
    }
}

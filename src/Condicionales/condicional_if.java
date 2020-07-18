package Condicionales;

import jdk.jshell.Diag;

import javax.swing.*;

public class condicional_if {
    public static void main(String[] args) {
        /*
        * == : igual
        * != : diferencia
        * > : mayor
        * < : menor
        * <= : menor igual que
        * >= : mayor igual que
        * */

        int dato = 5;
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        if(numero == dato){
            JOptionPane.showMessageDialog(null,"Son numeros iguales");
        }else{
            JOptionPane.showMessageDialog(null,"Los numero no son iguales");
        }
    }
}

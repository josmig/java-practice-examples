package Condicionales;

import javax.swing.*;

public class condicional_switch {
    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero entre 1 y 5"));
        switch (dato){
            case 1:
                JOptionPane.showMessageDialog(null,"Es el numero 1");
//el break nos sirve para salir del swith en caso ya se haya ejecutado la condicion porque si no pasara al siguiente
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Es el numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Es el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Es el numero 5");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No cumple con la regla: Debes elegir entre 1 y 5");
                break;
        }
    }
}

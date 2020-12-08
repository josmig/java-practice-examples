package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_pares_impares {
	public static void main (String [] args) {
		
		
		int num1,num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
		
		if(num1 % 2 == 0 && num2 % 2 == 0) {
			JOptionPane.showMessageDialog(null,"Ambos numeros son pares");
		}else if(num1 % 2 != 0 && num2 % 2 != 0) {
			JOptionPane.showMessageDialog(null,"Ambos numeros son impares");
		}else {
			JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
		}
			
	}
}

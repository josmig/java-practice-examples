package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_cifras {

	public static void main(String [] args) {
		
		int num;		
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 99 999"));
		
		if(num < 10) {
			JOptionPane.showMessageDialog(null,"El numero" + num + " tiene 1 digito");
		}else if(num < 100) {
			JOptionPane.showMessageDialog(null,"El numero" + num + " tiene 2 digitos");
		}else if(num < 1000) {
			JOptionPane.showMessageDialog(null,"El numero" + num + " tiene 3 digitos");
		}else if(num < 10000) {
			JOptionPane.showMessageDialog(null,"El numero" + num + " tiene 4 digitos");
		}else if(num < 100000) {
			JOptionPane.showMessageDialog(null,"El numero" + num + " tiene 5 digitos");
		}else {
			JOptionPane.showMessageDialog(null, "No contamos con mas cifras en el sistema");
		}
		
	}
}

package condicionales;

import javax.swing.JOptionPane;

public class ejercicios_calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,suma,resultado,resta,division,multiplicacion;
		
		char operacion;
		
		operacion= JOptionPane.showInputDialog("Ingrese operacion").charAt(0);
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
		
		switch(operacion) {
			case 's':
			case 'S':
				suma= num1+num2;
				JOptionPane.showMessageDialog(null, "El resultado de la suma es " + suma);
				break;
			case 'r':
			case 'R':
				resta= num1-num2;
				JOptionPane.showMessageDialog(null, "El resultaoo de la resta es " + resta);
				break;
			case 'm':
			case 'M':
				multiplicacion = num1 * num2;
				JOptionPane.showMessageDialog(null, "El resultaoo de la multiplicacion es " + multiplicacion);
				break;
			case 'd':
			case 'D':
				division = num1 / num2;
				JOptionPane.showMessageDialog(null, "El resultado de la division es " + division);
				break;
			default :
				JOptionPane.showMessageDialog(null, "Erro se equivoco de operacion");
				break;
		}
	}

}

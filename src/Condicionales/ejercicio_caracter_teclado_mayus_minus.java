package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_caracter_teclado_mayus_minus {

	public static void main(String [] args) {
		
		char caracter;
		
		//Con chatAt(0) nos pinta la primera posicion de una cadena
		caracter= JOptionPane.showInputDialog(null,"Digite un caracter").charAt(0);
		
		if(Character.isUpperCase(caracter)) {
			JOptionPane.showMessageDialog(null, "El caracter esta en Mayuscula");
		}else {
			JOptionPane.showMessageDialog(null, "El caracter esta en Minuscula");
		}
		
		
	}
}

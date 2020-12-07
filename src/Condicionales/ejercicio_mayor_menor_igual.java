package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_mayor_menor_igual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1,numero2;
		
		JOptionPane.showMessageDialog(null,"Ejercicio mayor , menor y igual");
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "El numero" + numero1 + " es mayor que " + numero2);			
					
		}else if(numero2 > numero1){
			JOptionPane.showMessageDialog(null, "El numero" + numero2 + " es mayor que " + numero1);
		}else {			
			JOptionPane.showMessageDialog(null,"El numero " + numero1 + " y "
					+ numero2 + " son iguales");
		}
				
		
	}

}

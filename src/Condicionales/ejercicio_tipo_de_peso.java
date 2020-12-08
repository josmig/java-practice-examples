package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_tipo_de_peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float medida;
		int opcion;
		medida= Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de KG"));
		opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU\n" 
					+ "1. Hectogramos\n"
					+ "2. Decagramos\n" 
					+ "3. Gramos\n" 
					+ "4. Desigramos\n"
					+ "5. Centigramos\n"
					+ "6. Miligramos\n"));
		
		
		switch(opcion) {
		case 1:	
			medida *=10;
			JOptionPane.showMessageDialog(null, "La nueva medida en Hectogramos es de " + medida);
			break;
		case 2:
			medida *=100;
			JOptionPane.showMessageDialog(null, "La nueva medida en Decagramos es de " + medida);
			break;
		case 3:
			medida *=1000;
			JOptionPane.showMessageDialog(null, "La nueva medida en Gramos es de " + medida);
			break;
			
		case 4:
			medida *=10000;
			JOptionPane.showMessageDialog(null, "La nueva medida en Desigramos es de " + medida);
			break;
		case 5:
			medida *= 100000;
			JOptionPane.showMessageDialog(null, "La nueva medida en Centigramos es de " + medida);
			break;
		case 6:
			medida *= 1000000;
			JOptionPane.showMessageDialog(null, "La nueva medida en Miligramos es de " + medida);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Se confundio en opcion de menu");
		}
	}

}

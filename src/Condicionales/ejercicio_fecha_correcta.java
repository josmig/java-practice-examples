package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_fecha_correcta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia , mes ,año;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
		año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
		
		if(dia >= 1 && dia <=30) {
			if(mes >=1 && mes <=12) {
				if(año !=0 ) {
					JOptionPane.showMessageDialog(null,"Fecha correcta");
				}else {
					JOptionPane.showMessageDialog(null, "Fecha incorrecta,año incorrecto");
				}
			}
		}
	}

}

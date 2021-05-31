package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_notas {

	public static void main(String [] args) {
		
		int nota;
		
		nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota"));
		
		if(nota >=1 && nota <=3) {
			JOptionPane.showMessageDialog(null, "Sus notas son insuficientes");
		}else if(nota >=4 && nota <=6 ) {
			JOptionPane.showMessageDialog(null, "Su nota es suficiente para pasar");
		}else if(nota >=7 && nota ==8) {
			JOptionPane.showMessageDialog(null, "Su nota es muy buena");
		}else if(nota == 9) {
			JOptionPane.showMessageDialog(null, "Su nota es demasiado notable");
		}else if(nota ==10) {
			JOptionPane.showMessageDialog(null, "Su nota es muy sobresaliente");
		}else {
			JOptionPane.showMessageDialog(null, "SU NOTA ES CERO");
		}
	}
}

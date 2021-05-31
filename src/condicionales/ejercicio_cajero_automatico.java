package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_cajero_automatico {
	
	public static void main(String [] args) {
		
		final int saldo_inicial=1000;
		int opcion;
		float ingreso,retiro,saldo_actual;
		JOptionPane.showConfirmDialog(null, "Quieres continuar el ATM?");
		
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al cajero automatico"
				+"Ingrese :"+
				" 1: Ingresar saldo a la cuenta"+
				" 2: Retirar dinero de la cuenta"+
				" 3: Salir"));	
		
		switch(opcion) {
		case 1:
			ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nueva cantidad"));
			saldo_actual = saldo_inicial+ingreso;
			JOptionPane.showMessageDialog
				(null, "Operación exitosa! Usted cuenta ahora con" + saldo_actual);
			break;
		case 2:
			retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad para retiro"));
			if(retiro > saldo_inicial) {
				JOptionPane.showMessageDialog(null, "No cuentas con el saldo suficiente");
			}else {
				saldo_actual = saldo_inicial - retiro;
				JOptionPane.showMessageDialog
					(null, "Retiro exitisos! usted cuenta ahora con" + saldo_actual);	
			}
			
			break;
		case 3:
			JOptionPane.showConfirmDialog(null, "Gracias por su visita");
			break;
		default:
			JOptionPane.showMessageDialog(null,"No tenemos otros servicios mas que ese");
			break;
		}
		
	}
}

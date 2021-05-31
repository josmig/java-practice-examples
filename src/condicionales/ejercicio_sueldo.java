package condicionales;

import javax.swing.JOptionPane;

public class ejercicio_sueldo {

	
	public static void main(String [ ]args) {
		//salario semanal
		int hora=16, hora_extra=20;
		
		int hora_semanal;
		hora_semanal= Integer.parseInt
				(JOptionPane.showInputDialog("Digite las horas semanales que trabajo"));
		
		if(hora_semanal <= 40) {
			hora_semanal *= hora;
			JOptionPane.showMessageDialog(null, "Su salario es de " + hora_semanal);
		}else {
			int resultado = hora_semanal * hora + ((hora_semanal=40)* hora_extra);
			JOptionPane.showMessageDialog(null, "Su salario es de " + resultado);
		}
	}
	
}

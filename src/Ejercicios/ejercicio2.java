package Ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Calcular el sueldo semana del empleado sabiendo sus horas semanales de trabajo y su ganancia por hora

        System.out.println("Digite al empleado");
        String empleado;
        double salario_semanal ,salario_hora;
        byte horas_trabajo_semanal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el nombre del empleado : ");
        empleado=scanner.nextLine();
        System.out.println("Datos del laburo");
        System.out.println("Horas semanales");
        horas_trabajo_semanal = scanner.nextByte();
        System.out.println("Digite lo que gana por hora");
        salario_hora = scanner.nextDouble();

        salario_semanal =  horas_trabajo_semanal * salario_hora;
        System.out.println("El empleado ".concat(empleado) + " trabaja "
                + horas_trabajo_semanal + " horas a la semana, con un sueldo  total de: " + " $"+salario_semanal );
	}

}

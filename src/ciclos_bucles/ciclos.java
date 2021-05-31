package ciclos_bucles;

import java.util.Scanner;

public class ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		int i=1 ,contador;
		System.out.print("Digite cuantos numeros quieres en pantalla");
		contador=s.nextInt();
		while(i<=contador) {
			System.out.println(i);
			i++;
		}
	}

}

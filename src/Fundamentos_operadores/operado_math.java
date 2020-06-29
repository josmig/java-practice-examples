package Fundamentos_operadores;

public class operado_math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Raiz cuadrada
        System.out.println("Metodo Math para sacar Raiz Cuadrada");
        int raiz =(int) Math.sqrt(9); //casting
        double raiz1 = Math.sqrt(39);
        System.out.println(raiz);
        System.out.println(raiz1);

        //Exponente
        System.out.println("Metodo para sacar exponente");
        double base = 5 , exponente=2;
        double resultado= Math.pow(base,exponente);
        System.out.println(resultado);

        //Round
        System.out.println("Redondeo");
        float num = 19.59f;
        int result = Math.round(num);
        System.out.println(result);

        //Random
        System.out.println("Random");
        double numero = Math.random();
        System.out.println(numero*100);
	}

}

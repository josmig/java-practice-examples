package Fundamentos_operadores;

public class operadores_decremento_incremento {
	private void psvm() {
		// TODO Auto-generated method stub
		  /*int x = 5;
        x++;*/

        int x =5 ,y;
        //sufijo  x++ asignando x-- (primero asigna luego la operacion)
        //prefijo ++x aumento --x (primero hace la operacion despues asigna)
        y= x--;
        System.out.println(y);
        System.out.println(x);
	}
}

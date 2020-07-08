package Fundamentos.Operadores;

public class operador_decremento {
    public static void main(String[] args) {
        int x =5 ,y;
        //sufijo  x++ asignando x-- (primero asigna luego la operacion)
        //prefijo ++x aumento --x (primero hace la operacion despues asigna)
        y= x--;
        System.out.println(y);
        System.out.println(x);
    }
}

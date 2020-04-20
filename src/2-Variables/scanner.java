import java.util.Scanner;

class scanner{
    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre , por favor");
        Scanner scanner = new Scanner(System.in);
        var nombre =scanner.nextLine();
        System.out.println("Hola \t" + nombre + " Mucho gusto");

    }
}
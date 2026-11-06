import java.util.Scanner;
public class Ej39 {
    public static void main(String[] args)  { 
    Scanner scanner = new Scanner(System.in);
    System.out.print( "Introduce un entero no negativo: ");
    int numero = Integer.parseInt(scanner.nextLine());
    if (numero < 0) {
        System.out.println("El número introducido no es válido. Debe ser un entero no negativo.");
    } else {
        int cifras = 0;
        if (numero == 0) {
            cifras = 1; 
        } else {
            while (numero > 0) {
                numero /= 10;
                cifras++;
            }
        }
        System.out.println("El número tiene " + cifras + " cifra(s).");
    }
}
}


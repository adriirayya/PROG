
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);

    int pares = 0;
    int impares = 0;

     for (int i = 0; i < 12; i++) {

        System.out.print("Introduce un entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
            
     }
     System.out.println("Pares: " + pares);
     System.out.println("Impares: " + impares);
     
}
}

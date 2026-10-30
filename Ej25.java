import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un entero positivo: ");
        int numero = Integer.parseInt(scanner.nextLine());
        
        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
            numero = Integer.parseInt(scanner.nextLine());
        } else {
            long factorial = 1;

            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    

        scanner.close();
    }
}

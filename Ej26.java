
import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        int base = Integer.parseInt(scanner.nextLine());

        System.out.print("Exponente no negativo: ");
        int exponente = Integer.parseInt(scanner.nextLine());

        if (exponente < 0) {
            System.out.println("El exponente debe ser no negativo.");
        } else {
            long resultado = 1;

            for (int i = 0; i < exponente; i++) {
                resultado *= base;
                
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}

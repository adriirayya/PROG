
import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un número entero positivo: ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            System.out.print("Divisores: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        scanner.close();
    }
}

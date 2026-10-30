
import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un maximo: ");
        int maximo = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce un minimo: ");
        int minimo = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);

        scanner.close();
    }
}

import java.util.Scanner;

public class Ej46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Introduce un entero: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                valido = true;
            } else {
                System.out.println("Error: debes introducir un entero válido.");
                scanner.next();
            }
        }

        System.out.println("Has introducido: " + numero);
        scanner.close();
    }
}

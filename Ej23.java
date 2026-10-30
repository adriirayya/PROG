import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero minimo: ");
        int minimo = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 6; i++) {
            System.out.print("Introduce un entero: ");
            int numero = scanner.nextInt();

            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.println("El mínimo es: " + minimo);
        scanner.close();
    }
}

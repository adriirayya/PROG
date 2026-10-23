import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer entero: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el segundo entero: ");
        int b = scanner.nextInt();
        System.out.print("Introduce el tercer entero: ");
        int c = scanner.nextInt();

        int mayor = a;
        int menor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);

        scanner.close();
    }
}

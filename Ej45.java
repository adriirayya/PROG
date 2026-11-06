import java.util.Scanner;

public class Ej45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("El MCD es: " + a);
    }
}

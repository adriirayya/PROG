
import java.util.Scanner;

public class Ej40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce un número entero positivo: ");
        int num = Integer.parseInt(scanner.nextLine());
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        System.out.println("La suma de las cifras es: " + suma);
    }
}

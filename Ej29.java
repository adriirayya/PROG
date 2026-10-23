
import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un año: ");
        int año = scanner.nextInt();

        if ((año % 400 == 0) || (año % 4 == 0 && año % 100 != 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("La edad introducida no es válida.");
        } else if (edad >= 0 && edad <= 3) {
            System.out.println("Precio: 0 €");
        } else if (edad >= 4 && edad <= 15) {
            System.out.println("Precio: 4 €");
        } else if (edad >= 16 && edad <= 64) {
            System.out.println("Precio: 9 €");
        } else {
            System.out.println("Precio: 5 €");
        }

        scanner.close();
    }
}

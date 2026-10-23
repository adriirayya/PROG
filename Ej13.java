import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        if (palabra.equals("delta42")) {
            System.out.println("La palabra es correcta.");
        } else {
            System.out.println("La palabra no es válida.");
        }

        scanner.close();
    }
}

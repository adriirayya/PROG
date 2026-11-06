import java.util.Scanner;

public class Ej42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");
        int num = Integer.parseInt(scanner.nextLine());
        // Indica si un entero positivo se lee igual en ambos sentidos.
        String numStr = Integer.toString(num);
        int length = numStr.length();
        String concatenador = "";
        for (int i = 0; i < length ; i++) {
            System.out.print(numStr.charAt(length -1 - i));
            concatenador = concatenador + numStr.charAt(length -1 -i);
        }
        if (numStr.equals(concatenador)) {
            System.out.println(" El número es capicúa.");
        } else {
            System.out.println(" El número no es capicúa.");
        }

    }
}


import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 4: ");
        int numero = scanner.nextInt();

        String estacion = switch (numero) {
            case 1 -> "Primavera";
            case 2 -> "Verano";
            case 3 -> "Otoño";
            case 4 -> "Invierno";
            default -> "Número no válido";
        };

        System.out.println("Estación: " + estacion);
        scanner.close();
    }
}

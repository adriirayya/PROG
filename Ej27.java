import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce los GB consumidos durante el mes: ");
        double gb = scanner.nextDouble();

        if (gb < 0) {
            System.out.println("Los GB no pueden ser negativos.");
        } else if (gb <= 10) {
            System.out.println("Bajo");
        } else if (gb <= 50) {
            System.out.println("Medio");
        } else {
            System.out.println("Alto");
        }

        scanner.close();
    }
}

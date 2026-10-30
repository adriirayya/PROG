import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int porcentaje;

        do {
            System.out.print("Introduce un porcentaje entre 0 y 100: ");
            porcentaje = scanner.nextInt();
        } while (porcentaje < 0 || porcentaje > 100);

        System.out.println("Porcentaje válido: " + porcentaje + "%");
    }
}

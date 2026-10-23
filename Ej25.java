import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el importe inicial de la compra: ");
        double importe = scanner.nextDouble();

        double descuento;

        if (importe < 80) {
            descuento = 0;
        } else if (importe >= 80 && importe <= 149.99) {
            descuento = 5;
        } else if (importe >= 150 && importe <= 299.99) {
            descuento = 10;
        } else {
            descuento = 15;
        }

        double importeFinal = importe - (importe * descuento / 100);

        System.out.println("Importe inicial: " + importe + " €");
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Importe final: " + importeFinal + " €");

        scanner.close();
    }
}

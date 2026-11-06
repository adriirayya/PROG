import java.util.Scanner;

public class Ej38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hayNegativo = false;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Introduce valor " + i + ": ");
            int numero = sc.nextInt();

            if (numero < 0) {
                hayNegativo = true;
            }
        }

        if (hayNegativo) {
            System.out.println("Aparecio al menos un numero negativo.");
        } else {
            System.out.println("No aparecio ningun numero negativo.");
        }
    }
}

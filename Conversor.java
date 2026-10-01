import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Millas:");
        String millasStr = entrada.nextLine();
        double millas = Double.parseDouble(millasStr);

        final double FACTOR_CONVERSION = 0.621371;
        double km = millas / FACTOR_CONVERSION;
        System.out.printf("Km: %.2f, Millas: %.2f\n", km, millas);
        entrada.close();
    }
}
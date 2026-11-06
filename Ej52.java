import java.util.Scanner;

public class Ej52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            int espacios = altura - i;
            int asteriscos = 2 * i - 1;
            System.out.println(" ".repeat(espacios) + "*".repeat(asteriscos));
           
        }
         scanner.close();
    }
}

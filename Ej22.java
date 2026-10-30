
import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el numero maximo: ");
        int maximo = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if(num < maximo) {
                maximo = num;
            }
        }
        scanner.close();
    }
}

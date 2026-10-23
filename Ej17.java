
import java.util.Scanner;

public class Ej17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el numero 1 2 3 o 4: ");
            int x = Integer.parseInt(scanner.nextLine());

            switch (x) {
                case 1: 
                    System.out.println("Español");
                    break;
                case 2:
                    System.out.println("Inglés");
                    break;

                case 3:
                    System.out.println("Francés");
                    break;

                case 4:
                    System.out.println("Italiano");
                    break;

            }

        }
}

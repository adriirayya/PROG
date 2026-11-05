
import java.util.Scanner;

public class Ej32 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = Integer.parseInt(scanner.nextLine());
        

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
           
        }
    }
}

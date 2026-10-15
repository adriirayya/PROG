import java.util.Scanner;
public class Ejercicio412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Introduce un numero");
        int x = Integer.parseInt(scanner.nextLine());
        if (x % 4 == 0) {
            System.out.println("es multiple de 4");

        }
    }
}
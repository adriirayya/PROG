import java.util.Scanner;
public class Ejercicio418 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("¿A cuanta temperatura está el sensor?");
    int x = Integer.parseInt(scanner.nextLine());

    if (x < -40) {
        System.out.println("Fuera de servicio");
        
    }
    if (x > 85) {
        System.out.println("Fuera de servicio");
    }
    scanner.close();


    }
}
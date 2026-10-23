
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce N, S, E, O: ");
        char nose = scanner.nextLine().charAt(0);

        if ( nose == 'N') {
            System.out.println("Este es tu rango N");
        }
        else if (nose == 'S') {
            System.out.println("Este es tu rango S");
        }
        else if (nose == 'E') {
            System.out.println("Este es tu rango E");
        }
         else if (nose == 'O') {
            System.out.println("Este es tu rango ");
        }
        else {
            System.out.println("Rango Incorrecto");
        }
    }
}

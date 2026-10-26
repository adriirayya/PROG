
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = Integer.parseInt(scanner.nextLine());
        int contador = 0;

        while (num != -1) {
            if(num >= 0) {
            contador += num;
            }
            if (num >= 0) {
                
                System.out.println("Contador: " + contador);
                System.out.println("Introduce otro numero: ");
                num = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("Introduce un numero positivo");
                num = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("La suma de los numeros es: " + contador);

    }
}
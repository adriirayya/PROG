
import java.util.Scanner;

public class Ej41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = Integer.parseInt(scanner.nextLine());
        String numStr = Integer.toString(num);

        int length = numStr.length();
        // i = 0 -> .charAt(length - 1) accedo al último digito/caracter
        // i = 1 -> .CharAt(length - 2) accedo al penúltimo digito/caracter
        // i = 2 -> -CharAt(Length - 3) accedo al antepenúltimo digito/caracter
        // i = -- -> .CharAt(length -1 - i) accedo al digito/caracter en la posición i
        // i = ¿? = length
        String concatenador = "";
        for (int i = 0; i < length ; i++) {
            System.out.print(numStr.charAt(length -1 - i));
            concatenador = concatenador + numStr.charAt(length -1 -i);
        }   
          
    }
}

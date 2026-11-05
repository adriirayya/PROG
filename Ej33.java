import java.util.Scanner;

public class Ej33 {
      public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = Integer.parseInt(scanner.nextLine());
        

        
        for (int i = altura; i >= 1; i--) {
        for (int columna = 1; columna <= i; columna++) {
        System.out.print("*");
     }

         System.out.println();
        }
           
        }
    }


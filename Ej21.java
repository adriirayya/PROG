import java.util.Scanner;

public class Ej21 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el numero 1 2 3 o 4: ");
            int x = Integer.parseInt(scanner.nextLine());

            switch (x) {
                case 1 ->  
                    System.out.println("Español");
                    
                case 2 ->
                    System.out.println("Inglés");
                  

                case 3 ->
                    System.out.println("Francés");
                   

                case 4 ->
                    System.out.println("Italiano");
                   

            }

        }
}
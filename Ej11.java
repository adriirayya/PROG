import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        int x = Integer.parseInt(scanner.nextLine());

          System.out.println("Dime otro numero");
        int y = Integer.parseInt(scanner.nextLine());

        if (y != 0){
            System.out.println("claro que si papoi, es diferente de 0 la divsión papoi:");
        }
            scanner.close();

    }
}
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un dia de la semana (1,2,3,4,5,6 o 7");
        int x = Integer.parseInt(scanner.nextLine());

        if (x == 6 || x == 7){
            System.out.println("Fin de semana papoi");
        }
            scanner.close();

        
    }
}
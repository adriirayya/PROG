import java.util.Scanner;
public class Ejercicio411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("¿Cuánta báteria tienes?");
        int bateria = Integer.parseInt(scanner.nextLine());
        if (bateria < 20) {
            System.out.println("Nivel bajo");
        }
    }
}
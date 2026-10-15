import java.util.Scanner; 
public class Ejercicio416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("¿Cuánta báteria tienes?");
        int x = Integer.parseInt(scanner.nextLine());

        if (x >= 0 && x <=15);{
        System.out.println("Crítica");
        }
        if (x >= 16 && x <=40);{
        System.out.println("Baja");
        }
        if (x >= 41 && x <=80);{
        System.out.println("Normal");
        }
        if (x >= 81 && x <=100);{
        System.out.println("Alta");
        }
    }
}
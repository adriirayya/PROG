import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué edad tienes?");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("¿Estás autorizado?");
        boolean y = Boolean.parseBoolean(scanner.nextLine());

        if (x >= 18 && y) {
            System.out.println("Tienes acceso autorizado");
        } else {
            System.out.println("No tienes acceso autorizado");
        }

            

    }
}
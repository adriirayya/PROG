import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena (start, stop, status): ");
        String comando = scanner.nextLine();

        switch (comando) {
            case "start":
                System.out.println("Iniciando sistema.");
                break;
            case "stop":
                System.out.println("Deteniendo sistema.");
                break;
            case "status":
                System.out.println("Mostrando estado del sistema.");
                break;
            default:
                System.out.println("Comando no válido.");
                break;
        }

        scanner.close();
    }
}

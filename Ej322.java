import java.util.Scanner;
public class Ej322 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduzca proyecto:");
       
       String proyecto = scanner.nextLine();

        System.out.printf("Proyecto introducido:%n\"%s\"", proyecto);
        scanner.close();
    }
}
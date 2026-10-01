import java.util.Scanner;
public class Ej321 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca su nombre de usuario: ");
        String alias = usuario.nextLine();

        System.out.println("Usuario conectado: " + alias);
    }
}
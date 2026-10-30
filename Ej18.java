import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primera temperatura: ");
        int temp1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Segunda temperatura: ");
        int temp2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Tercera temperatura: ");
        int temp3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Cuarta temperatura: ");
        int temp4 = Integer.parseInt(scanner.nextLine());

        System.out.println("Quinta temperatura: ");
        int temp5 = Integer.parseInt(scanner.nextLine());

        System.out.println("Sexta temperatura: ");
        int temp6 = Integer.parseInt(scanner.nextLine());

        int media= (temp1+temp2+temp3+temp4+temp5+temp6)/6;

        System.out.println("la media es: " + media);
    }
}

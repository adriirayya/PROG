import java.util.Scanner;
public class MainLeerUnCaracter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        char caracter = line.charAt(0);
        System.out.println("Caracter introducido:" + caracter);

        System.out.println("Caracter introducido:" + scanner.nextLine().charAt(0));
    }
}

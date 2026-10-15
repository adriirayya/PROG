import java.util.Scanner;
public class Ejercicio414 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Número de personas de la sala (capacidad 60?");
        int aforo = Integer.parseInt(scanner.nextLine());
        if (aforo < 0) {
            System.out.println("No puede ser menor que 0");
        }
        if (aforo < 60 && aforo > 0){
            System.out.println("Aforo correcto");

        }
        if (aforo >= 60) {
            System.out.println("Aforo excedido");
    }
}
}
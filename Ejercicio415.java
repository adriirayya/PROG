import java.util.Scanner;
public class Ejercicio415 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        System.out.println("¿Qué distancia has recorrido 1?");
          double x = Double.parseDouble(scanner.nextLine());
          System.out.println("¿Qué distancia has recorrido 2?");
          double y = Double.parseDouble(scanner.nextLine());

          if (x == y) {
            System.out.println("Las distancias son iguales");
          }
          if (x > y) {
            System.out.println("La primera persona ha recorrido más distancia");
          }
          if (x < y) {
            System.out.println("La segunda persona ha recorrida más distancia");
          }



    }
}
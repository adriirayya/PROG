import java.util.Scanner;
public class Ejercicio417 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner (System.in);
        
        System.out.println("¿Cuanto porcentaje de humedad hay??");
        int x = Integer.parseInt(scanner.nextLine());   
        if (x >= 30 && x <= 70){
            System.out.println("Humedad adecuada");
        }

    }
}
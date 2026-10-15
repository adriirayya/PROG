import java.util.Scanner;
public class Ejercicio413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("¿Cuánta temperatura hace?");
        double temperatura = Double.parseDouble(scanner.nextLine());
        if (temperatura > 0){
            System.out.println("Positivo");

        }
        if (temperatura == 0) {
            System.out.println("Cero");

        }
        if (temperatura < 0) {
            System.out.println("Negativo");
        }
            

    }
}
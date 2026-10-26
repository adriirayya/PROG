
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        
            //refinamiento top down
            //declarar variables: int num, int contador = 0
            //Dentro de una estructura repetida
            // Pedir un num
            // Si el num es distinto de 0 incremetno contador
            // hasta que sea 0 
        
        int num = 0, contador = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = Integer.parseInt(scanner.nextLine());
         contador++;
        System.out.println("Intento: " + contador);
        

        while (num != 0) { 
            //num != 0 pedir num
             num = Integer.parseInt(scanner.nextLine());
            if (num != 0 ){
                System.out.println("Intento: " + contador);
                contador++;
            }
            else {
                System.out.println("Se ha introducido centinela 0");
            }
            contador++;
        }
        System.out.println("Contador: " + (--contador));
    }
}

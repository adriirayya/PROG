
import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
       
       System.out.println("Introduce un número de filas: ");
       int filas = Integer.parseInt(scanner.nextLine());

       System.out.println("Introduce un número de columnas: ");
       int columnas = Integer.parseInt(scanner.nextLine());
       
       for (int fila = 1; fila <= filas; fila++) {
    for (int columna = 1; columna <= columnas; columna++) {
        System.out.print("#");
    }

    System.out.println();
}

    }
}

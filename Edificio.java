import java.util.Scanner;
public class Edificio {
    public static void main(String[] args) {
        //Creo el objeto Scanner desde su constructor utilizando
        //el operador y la función constructora de Scanner.
        //A esta función constructora le paso stdin (teclado)
        //que en java está (abstracción) System.in
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce numero de plantas:");
        int numPlantas = entrada.nextInt();
        //6\n
         System.out.println("Introduce superficie del edificio:");
        double superficie = entrada.nextDouble();
        //123,456 (PELIGRO-> Locale ES entrada con , no con .)
       
        entrada.nextLine(); //Limpieza del buffer de entrada
        System.out.println("Introduzca el nombre del edificio:");
        //String pertenece al paquete de java.lang -> importado por defecto
        String nombreEdificio = entrada.next();
        System.out.printf("Numero de plantas: \t %d \t con una superficie: \t %.2f \t y nombre de edificio: \t %s \n", numPlantas, superficie, nombreEdificio);
        
    }
}
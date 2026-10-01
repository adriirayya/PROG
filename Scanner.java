import java.util.Scanner;
import java.util.Locale;
public class Scanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //stdout en Java se corresponde con System.out
        //stdin en java se corresponde con System.in 
       System.out.print("Introduzca un número de cajas: ");
       
       int numeroCajas =  entrada.nextInt();
       
       System.out.print("Número de items por caja:");
       int numeroItemsPorCaja = entrada.nextInt();

       int total = numeroCajas * numeroItemsPorCaja;

         System.out.println("El total de items es: " + total);

         System.out.println("Introduzca double");
         double variableLocalPorDefecto = entrada.nextDouble();
         
         entrada.useLocale(Locale.UK);
         System.out.println("Introduzca double: ");
         double  variableLocalUK = entrada.nextDouble();
    }
  
    }

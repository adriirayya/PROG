import java.util.Locale;
import java.util.Scanner;
public class MainEntradaMultiplelnt {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        

         System.out.println("Introduzca distancia en metros:");
         double Distancia = entrada.nextDouble();
         
         entrada.useLocale(Locale.UK);
         System.out.println("Introduzca tiempo en segundos: ");
         double Segundos = entrada.nextDouble();

         System.out.println("La velocidad es: " + Distancia/Segundos + " m/s");
         System.out.println("La velocidad en kilometros por hora es: " + (Distancia/Segundos)*3.6 + " km/h");
    }
  
    }

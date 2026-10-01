import java.util.Scanner;
public class Prueba {
    public static void main(String [] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca codigo:");

        int codigo = entrada.nextInt();
        System.out.println("El codigo introducido es: " + codigo);
        
        entrada.close();



    }
}
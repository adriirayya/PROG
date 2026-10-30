
import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acum = 0;
        int contGE50 = 0;
        int contLT50 = 0;
        int puntos = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Intro. Puntos: ");
            puntos = Integer.parseInt (scanner.nextLine());
            while ( puntos < 0 || puntos > 100){
                System.out.println("Bro neta no te pases de lanza! rango de 1 a 100 points miss");
                System.out.println("Intro.Puntos");
                puntos = Integer.parseInt (scanner.nextLine());
            }
            acum += puntos;
            if (puntos >= 50) {
                contGE50++;
            } else {
                contLT50++;
            }
        }
        System.out.printf("%10s %10s %10s %n", "MEDIA.CONT", "CONT.GE50", "CONT.LT50" );
        System.out.printf("%10.2f %10d %10d", acum/8.0d, contGE50, contLT50);
    }
}

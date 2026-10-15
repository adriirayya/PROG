import java.util.Scanner;
public class nose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          System.out.println("Dime un numero");
        int x = Integer.parseInt(scanner.nextLine());

        if (x == 1 || x == 2 || x == 3 || x == 4) {
            System.out.println("Inicial");
        } 
              else  if (x == 4 || x == 5 || x == 6) {
            System.out.println("Intermedia");
                }
                  else  if (x == 7 || x == 8 ) {
            System.out.println("Alta");
        } 
              else  if (x == 9 || x == 10) {
            System.out.println("Excelente");
        } 
        else {
            System.out.println("Valor incorrecto");
        }
        } 

    }




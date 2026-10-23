import java.util.Scanner;
public class Ej19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Elige tu turno horario");
        char turno = scanner.nextLine().charAt(0);  
        
        switch (turno) {
            case 'M': 
                System.out.println("Turno mañana");
                break;

            case 'T':
            System.out.println("Turno tarde");
            break;

            case 'N':
                System.out.println("Turno noche");

        } 
    }    
}

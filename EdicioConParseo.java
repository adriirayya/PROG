import java.util.Scanner;
public class EdicioConParseo {  
    public static void main(String[] args) {
        //Creo el objeto Scanner desde su constructor utilizando
        //el operador y la función constructora de Scanner.
        //A esta función constructora le paso stdin (teclado)
        //que en java está (abstracción) System.in
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce numero de plantas:");
        // con nextline pido un String hasta intro(\n) y lo guardo en numPlstr
        String numPlstr = entrada.nextLine();
        //Con Integer.parseint(...) convierto una cadena a tipo int
        int numPl = Integer.parseInt(numPlstr);

        System.out.println("Introduce nombre del edificio:");
        String nomEd = entrada.nextLine();
        System.out.printf("Num. plantas %d y nombre edificio %s", numPl, nomEd);
      
    }
}
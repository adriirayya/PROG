/*
Pide:

- número de estanterías;
- cajas por estantería;
- unidades por caja.

Calcula el número total de unidades almacenables.

Utiliza enteros.
Utilizamos el nextLine
*/



import java.util.Scanner;
public class Ej323nextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de estanterías:");
        int estanterias = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca el número de cajas por estantería:");
        int cajasPorEstanteria = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduzca el número de unidades por caja:");
        int unidadesPorCaja = Integer.parseInt(scanner.nextLine());

        int totalUnidades = estanterias * cajasPorEstanteria * unidadesPorCaja;
        System.out.printf("Num. estanterias: %d%nNum. cajas por estantería: %d%nNum. unidades por caja: %d%nTotal de unidades almacenables: %d",
                estanterias, cajasPorEstanteria, unidadesPorCaja, totalUnidades);
        scanner.close();
    }
}
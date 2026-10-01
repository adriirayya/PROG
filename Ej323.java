/*
Pide:

- número de estanterías;
- cajas por estantería;
- unidades por caja.

Calcula el número total de unidades almacenables.

Utiliza enteros.

*/



import java.util.Scanner;
public class Ej323 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de estanterías:");
        int estanterias = scanner.nextInt();
        
        System.out.println("Introduzca el número de cajas por estantería:");
        int cajasPorEstanteria = scanner.nextInt();

        System.out.println("Introduzca el número de unidades por caja:");
        int unidadesPorCaja = scanner.nextInt();

        int totalUnidades = estanterias * cajasPorEstanteria * unidadesPorCaja;
        System.out.printf("Num. estanterias: %d%nNum. cajas por estantería: %d%nNum. unidades por caja: %d%nTotal de unidades almacenables: %d",
                estanterias, cajasPorEstanteria, unidadesPorCaja, totalUnidades);
        scanner.close();
    }
}
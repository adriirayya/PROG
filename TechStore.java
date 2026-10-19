import java.util.Scanner;
public class TechStore {
    public static void main(String[] args) {
         // Códigos Unicode de doble línea
        char esqSupIzq = '\u2554'; // ╔
        char esqSupDer = '\u2557'; // ╗
        char esqInfIzq = '\u255A'; // ╚
        char esqInfDer = '\u255D'; // ╝
        char horiz      = '\u2550'; // ═
        char vert       = '\u2551'; // ║

        String lineaSup = esqSupIzq + Character.toString(horiz).repeat(40) + esqSupDer;
        String lineaMed = vert + " ".repeat(8) + "TECHSTORE - NUEVA VENTA" + " ".repeat(9) + vert;
        String lineaInf = esqInfIzq + Character.toString(horiz).repeat(40) + esqInfDer;
        System.out.println(lineaSup);
        System.out.println(lineaMed);
        System.out.println(lineaInf);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Producto: ");
        String producto = scanner.nextLine();

        System.out.println("Precio/u (\u20AC) ");
        double precio = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        System.out.println ("""
                Tipo de cliente
                ----------------
                1. Particular
                2. Estudiante
                3. Empresa

                Seleccione: 2
        """);
        int tipoCliente = Integer.parseInt(scanner.nextLine());

        System.out.println("""
                Forma de pago
                -------------
                T. Tarjeta
                E. Efectivo
                B. Bizum

                Seleccione: T
                """);
                char formaPago = scanner.nextLine().toUpperCase().charAt(0);


                if (producto.strip().length() > 3) {
                    System.out.println("Nombre de producto vacío");
                }
                if (precio <= 0.0) {
                    System.out.println("Precio cero o negativo");
                }

                if (cantidad <= 0 || cantidad >= 11) {
                    System.out.println("Cantidad fuera de rango [1,10]");
                }

                if (tipoCliente < 1 || tipoCliente > 3) {
                    System.out.println("Tipo incorrecto, sólo se aceptan 1,2,3 ");
                }
                if (formaPago != 'T' && formaPago != 'E' && formaPago != 'B') {
                    System.out.println();
                }
                scanner.close();





    }
}
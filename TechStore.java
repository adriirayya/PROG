import java.util.Scanner;
public class TechStore {
    public static final double DESC_MENOR_100 = 0;
    public static final double DESC_DESDE_100_MENOR_300 = 0.05;
    public static final double DESC_DESDE_300_MENOR_500 = 0.08;
     public static final double DESC_DESDE_500_MAS = 0.1;

    public static final double DESC_PARTICULAR = 0.0;
    public static final double DESC_ESTUDIANTE = 0.03;
    public static final double DESC_EMPRESA = 0.04;

     public static final double DESC_TARJETA = 0.0;
    public static final double DESC_EFECTIVO = 0.02;
    public static final double DESC_BIZUM = 0.01;


     public static final double DESC_MAX = 0.015;
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
                    System.out.println("""
                            -------------------------------------------
                            ERROR: los datos de la venta no son válidos
                            -------------------------------------------

                            """);
                }
                double descuento = 0;
                double importeBruto = cantidad*precio;
                if (importeBruto <= 100) {
                    descuento = importeBruto * DESC_MENOR_100;
                }
                else if ( /*importeBruto >= 100 &&*/ importeBruto < 300) {
                    //Si llego aqui es obligatorio importe >=100
                    descuento = importeBruto * DESC_DESDE_100_MENOR_300;
                }
                 else if ( /*importeBruto >= 300 &&*/ importeBruto < 500) {
                    //Si llego aqui es obligatorio importe >=300
                    descuento = importeBruto * DESC_DESDE_300_MENOR_500;
                 }
                  else {
                    //Si llego aqui es obligatorio importe >=500
                    descuento = importeBruto * DESC_DESDE_500_MAS;
                 }

                 if (tipoCliente == 1) {
                    //particular
                    descuento += DESC_PARTICULAR;
                    //desc = desc + DESC_PARTICULAR;
                 }
                 else if ( tipoCliente == 2 && cantidad >= 2) {
                    descuento += DESC_ESTUDIANTE;
                 }
                 else if (/*tipo Cl78 iente == 3 && */cantidad >=3 && importeBruto >= 250){
                    //porque tengo validacion y si o si habra un tipocliente valido
                 }

                 switch (formaPago) {
                    case 'T':
                        descuento += DESC_TARJETA;
                        break;
                    case 'E':
                        descuento += DESC_EFECTIVO;
                        break;

                    case 'B':
                        if (importeBruto >= 200) {
                        descuento += DESC_BIZUM;
                        }
                        break;
                 }

                 if (descuento > DESC_MAX) {
                    descuento = DESC_MAX;
                 }

                double importeNeto = importeBruto * (1 - descuento);






                scanner.close();





    }
}
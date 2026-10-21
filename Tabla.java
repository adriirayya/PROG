
import java.util.Scanner;

public class Tabla {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre del producto 1");
        String NomProducto1 = entrada.nextLine();

        System.out.println("Cantidad del producto 1");
        int CantProducto1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Precio por unidad del producto 1");
        double PrecioUProducto1 = Double.parseDouble(entrada.nextLine());

        double importe1 = CantProducto1*PrecioUProducto1;


        System.out.println("Nombre del producto 2");
        String NomProducto2 = entrada.nextLine();

        System.out.println("Cantidad del producto 2");
        int CantProducto2 = Integer.parseInt(entrada.nextLine());

        System.out.println("Precio por unidad del producto 2");
        double PrecioUProducto2 = Double.parseDouble(entrada.nextLine());

                double importe2 = CantProducto2*PrecioUProducto2;




        System.out.println("Nombre del producto 3");
        String NomProducto3 = entrada.nextLine();

        System.out.println("Cantidad del producto 3");
        int CantProducto3 = Integer.parseInt(entrada.nextLine());

        System.out.println("Precio por unidad del producto 3");
        double PrecioUProducto3 = Double.parseDouble(entrada.nextLine());

                double importe3 = CantProducto3*PrecioUProducto3;

        double TOTAL = importe1 + importe2 + importe3;
        
        //tabla 
        System.out.println("-".repeat(54));
        System.out.printf("%-20s" + "%-8s" + "%-12s" + "%-14s", "Producto", "Cant.",  "Precio/u", "Importe");
        System.out.println();
        System.out.println("-".repeat(54));
        System.out.printf("%-20s" + "%-8d" + "%-12.2f" + "%-14.2f" + "%n", NomProducto1, CantProducto1, PrecioUProducto1, importe1  );
        System.out.printf("%-20s" + "%-8d" + "%-12.2f" + "%-14.2f" + "%n", NomProducto2, CantProducto2, PrecioUProducto2, importe2  );
        System.out.printf("%-20s" + "%-8d" + "%-12.2f" + "%-14.2f" + "%n", NomProducto3, CantProducto3, PrecioUProducto3, importe3  );
                System.out.println("-".repeat(54));
                System.out.printf("%-40s" + "%-14.2f" + "%n", "TOTAL", TOTAL );
                System.out.println("-".repeat(54));


    }
}
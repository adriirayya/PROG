public class Ej30 {
    public static void main(String[] args) {
        for (int i = 2; i <= 80; i++) {
        System.out.println("Analizando si " + i + "es primo");
        boolean esPrimo = true;
        for (int j = 2; j < Math.sqrt(i); j++) {
            // num = raiz_num * vraiz_num
            if (i % j == 0) {

                esPrimo = false;
                System.out.println(i + "no es primo");
                break;
                
            }
        }
        if (esPrimo) {
            System.out.println(i + " es primo");
        }
        }
    }
    
}

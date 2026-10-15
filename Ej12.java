public class Ej12 {
    public static void main(String[] args) {
     String barco = "Tempestad";
long registro = 45120;

String referencia =
        String.format("%s-%d", barco, registro);

System.out.println(referencia);
    }
}
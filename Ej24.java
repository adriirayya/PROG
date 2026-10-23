public class Ej24 {
    public static void main(String[] args) {
        int opcion = 2;

        String resultado = switch (opcion) {
            case 1 -> {
                System.out.println("Opción 1 seleccionada.");
                yield "Primera opción";
            }
            case 2 -> {
                System.out.println("Opción 2 seleccionada.");
                yield "Segunda opción";
            }
            default -> "Opción no válida";
        };

        System.out.println(resultado);
    }
}

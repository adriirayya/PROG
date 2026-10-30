public class Ej17 {
    public static void main(String[] args) {
        String suma = "";
        int contador = 0;
        for(int i = 1; i<=200; i++){
            if(i % 4 == 0){
                
                
            suma = suma + " + " + i;
            }
            contador+=i;
        }
        System.out.println(suma + " = " + contador);

    }
}

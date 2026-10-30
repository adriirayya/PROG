public class Ej16 {
    public static void main(String[] args) {
        int acum = 0;
        String strAcum = "";
        for(int i =1; i <= 50; i++){
            if(i==1){
            strAcum = strAcum + i;
            }else{
               strAcum = strAcum +  " + " + i; 

            }
            
            acum += i;
        }
    }
}

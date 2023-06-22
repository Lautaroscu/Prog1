public class clase6_ejpromedio {
    public static void main(String[] args) {
        int promedio ;
        promedio = calc_promedio_1_1000_(); {
            System.out.println("el promedio es " + promedio) ;
        }
    }
    public static int calc_promedio_1_1000_() {
        final int MAX = 1000 ;
        final int MIN = 1 ;
        int suma = 0 ;
        int promedio ;
        for(int numero = MIN; numero <=MAX;numero++){
            suma += numero ;
         
        }
             promedio = suma/(MAX) ;
             return promedio ;
        

    }
    
}

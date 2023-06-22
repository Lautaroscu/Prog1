import java.io.BufferedReader ;
import java.io.InputStreamReader ;

public class clase6_ejercicio4 {
    public static void main (String[] args) {
       
        int numero ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
          ;
            
            System.out.println("ingrese un numero (0 para salir)") ;
            numero = Integer.valueOf(entrada.readLine()) ;
            while(numero != 0) {
                int sumatoria = calcular_sumatoria_1_200() ;
                System.out.println("la sumatoria es " + sumatoria) ;
                System.out.println("ingrese un numero (0 para salir)") ;
            numero = Integer.valueOf(entrada.readLine()) ;
                
                
            }
        }
        catch (Exception e) {
            System.out.println(e) ;
        }

        


    }
    public static int calcular_sumatoria_1_200 () {
        final int MAX = 200 ;
        final int MIN = 1 ;
        int suma = 0 ;

        
        for(int i = MIN; i <= MAX; i++){
            suma +=i ;
        
        }
        
        return suma ;



    }
    
}

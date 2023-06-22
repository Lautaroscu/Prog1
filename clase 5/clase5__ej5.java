import java.io.BufferedReader ;
import java.io.InputStreamReader ;


public class clase5__ej5 {
    public static void main(String[] args) {
        int numero2 = 0 ;
        int numero ;
        try {
            BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in)) ;
            
           
                System.out.println("Ingrese un entero mayor a 1 y menor/igual a 10") ;
            numero = Integer.valueOf(entrada.readLine());
           
        
               while((numero >= 1) && (numero <= 10)) {

                 numero2 = numero + numero2 ;
                System.out.println("Ingrese un entero mayor a 1 y menor/igual a 10") ;
                numero = Integer.valueOf(entrada.readLine());
               
            

               }
               System.out.println("La suma total de numeros introducidos es " + numero2) ;
            
            
         
            
        
           
            
        
           

        }
        catch (Exception exc) {
            System.out.println(exc) ;
        }
    }
    
}

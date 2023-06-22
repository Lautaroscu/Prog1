import java.io.BufferedReader ;
import java.io.InputStreamReader ; 

public class clase5_ej2 {
    public static void main (String[] args) {
        char caracter ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            
           //todo va dentro del do, esto solo frena cuando el while sea true 
            do{
                

               System.out.println("ingrese un caracter , ingrese * para salir") ;
                caracter = entrada.readLine().charAt(0) ;
             
            if((caracter > '1') && (caracter <='9')){
                System.out.println( caracter + " es caracter digito") ;
            }
            switch(caracter) {
                case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : {
                    System.out.println( caracter + " es caracter vocal minuscula") ;
                }
            }   
        }    
            while (caracter != '*') ;   
        
                            
        


        }
        catch (Exception exc) {
            System.out.println(exc) ;
        }
    }
    
}

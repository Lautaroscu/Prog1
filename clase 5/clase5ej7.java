import java.io.BufferedReader ;
import java.io.InputStreamReader ;

public class clase5ej7 {
    public static void main (String[] args) {
      

        char caracter ;
        char mayor ='a' ;
        char menor = 'z';
      
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
           
            System.out.println("Ingrese una letra minuscula entre la 'a' y la 'z'") ;
            caracter = entrada.readLine().charAt(0) ;
            

            while((caracter >= 'a') && (caracter <= 'z')) {
                System.out.println("Ingrese una letra minuscula entre la 'a' y la 'z' o una MAYUS para salir") ;
                caracter = entrada.readLine().charAt(0) ;
                
            }
            if(caracter >= mayor) {
                System.out.println("el caracter mas grande es " + mayor) ;
            }
            else if(caracter <= menor) {
                System.out.println("el caracter mas chico es " + menor) ;
            }
         

                
        
            
            
             
           
                
            }
            catch (Exception e) {
                System.out.println(e) ;
            }
        }
        
    }
    

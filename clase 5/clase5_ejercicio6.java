import java.io.BufferedReader ;
import java.io.InputStreamReader ;


public class clase5_ejercicio6 {

    public static void main(String[] args) {
        char caracter ;
         int contador = 0 ;
    
        try {
            BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in)) ;
            System.out.println("Ingrese una letra minuscula") ;
            caracter = entrada.readLine().charAt(0) ;
            while((caracter >= 'a') && (caracter <= 'z')) {
                switch(caracter) {
                    case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
                  
                    
                    contador++ ; //pongo contador ++ para que esos casos se sumen a la variable contador
                    break;
                }
               
           
                 
              
                    
                 System.out.println("Ingrese una letra minuscula") ;
                    caracter = entrada.readLine().charAt(0) ;
                  
     
 
                
                }
                System.out.println("la cantidad de vocales es " + contador) ;

            }
           


        catch (Exception e) {
                    System.out.println(e) ;
                }
        }
       

    }
    


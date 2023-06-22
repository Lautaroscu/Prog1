import java.io.BufferedReader ; 
import java.io.InputStreamReader ;

public class clase4_parte2 {
    public static void main(String[] args) {
        int numero ;
        try {
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)) ;
            System.out.println("ingrese un numero") ; 
            numero = Integer.valueOf(entrada.readLine()); 
            if (numero > 0) {
                System.out.println("es positivo") ;



                if (numero > 100) {

                    System.out.println("grande") ;

                }
                else  {
                    System.out.println("chico") ;
                }
                


            }
            if (numero % 2 == 0) {
                System.out.println("es par") ;
                if (numero % 3 == 0 ) {
                    System.out.println("es multiplo de 3") ; 
                    
                }
                else  {
                    System.out.println("ninguna de las anteriores") ;
                } 
            }
        }
    
        catch (Exception exc) {
            System.out.println(exc) ;
        }
    }
    
}

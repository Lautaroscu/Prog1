import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase5_tpprimerap {
    public static void main(String[] args) {
    
        int numero ;
        try {
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)) ;
            System.out.println("ingrese un numero") ;
                numero = Integer.valueOf(entrada.readLine()) ;
                if((numero % 2 == 0) && (numero % 3 == 0)) {
                    System.out.println( numero + " es par y multiplo de 3") ;
                }

            
            }

            
            catch(Exception exc) {
            System.out.println(exc) ;

        }
       
        }
    }
    


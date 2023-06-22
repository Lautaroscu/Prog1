import java.io.BufferedReader ;
import java.io.InputStreamReader ; 
public class clase4ejercicio4{
    public static void main(String[] args) {
        int numero ; 
        try {
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)) ;
            System.out.println("ingrese un numero") ;
            numero = Integer.valueOf(entrada.readLine()) ;
            if((numero % 6 == 0) & (numero % 7 == 0) ) {
                System.out.println("es multiplo de 6 y de 7") ;
            }
            else if ((numero > 30) & (numero % 2 == 0 )) {
                System.out.println("Es mayor a 30 y multiplo de 2") ;
            }
            else if ((numero)%5 > 10) {
                System.out.println("es mayor a 10") ;
            }
                
            
           














        } 
        catch (Exception exc) {
            System.out.println(exc) ;
        }
    }
}
    
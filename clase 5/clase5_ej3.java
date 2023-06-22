import java.io.BufferedReader ;
import java.io.InputStreamReader ; 

public class clase5_ej3 {
    public static void main(String[] args){
        int numero ;
        try{

           
             
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            do {
                
                 System.out.println("Ingrese un numero entero, pon 0 para salir") ;
                numero = Integer.valueOf(entrada.readLine()) ;

            }
            while(numero != 0) ;

        }
        catch (Exception exc) {
            System.out.println(exc);
         }
    }  
}

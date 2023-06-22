import java.io.BufferedReader ;
import java.io.InputStreamReader ;
public class clase6_ejercicio3 {
    public static void main(String[] args){
        char letra ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("ingrese una letra minuscula") ;
            letra = entrada.readLine().charAt(0) ;
            while((letra >= 'a') && (letra <= 'z')) {
                tablamultiplicar9();
                System.out.println("ingrese una letra minuscula") ;
                letra = entrada.readLine().charAt(0) ;
                
            }

            
        } 
        
        catch (Exception e) {
            System.out.println(e) ;

        }


    }
    public static void tablamultiplicar9() {
    final int MAXMULTIPLICADOR = 10 ;
    int numero = 9 ;
    for(int i= 1; i <= MAXMULTIPLICADOR; i++) {
        System.out.println(i + "*" + numero + "=" + (i*numero)) ;
    }
    }

}
/* Escribir un programa que dado un numero natural (entero > 0 o >=1) ingresado por el usuario llame un metodo
 que imprima de forma decreciente
los numeros naturales menores a ese numero ingresado. Finalmente, imprima el numero natural ingresado
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase6_ejemplo8{
    public static final int MIN = 1;
    public static void main(String[] args){
        int numero_natural;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("Ingrese un numero natural") ;
            numero_natural = Integer.valueOf(entrada.readLine()) ;
            imprimir_natural(numero_natural);
            System.out.println(numero_natural) ;


            
        }
         catch (Exception e) {
            System.out.println(e) ;
        }

    }
    public static void imprimir_natural(int numero) {
        while(numero >= MIN) {
            System.out.println("el natural es " + numero) ;
            numero-- ;
        }
    }
}

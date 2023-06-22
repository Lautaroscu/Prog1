import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un diseño de un programa que mientras el usuario ingrese
de un número entero mayor que 0, imprima la tabla de multiplicar
de 10. Cuando salga del ciclo vuelva a imprimir la tabla de
multiplicar de 10.
*/
public class clase6_ejemplo6{
 public static final int MAXMULTIPLICADOR = 10 ;
 public static final int MIN = 1 ;
 public static final int valor = 10 ;
 public static void main(String[] args) {
    int numero ;
    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println("Ingrese un numero natural") ;
        numero = Integer.valueOf(entrada.readLine()) ;
        while(numero > 0) {
            imprimir_tabla_multiplicar();
            System.out.println("Ingrese un numero natural") ;
        numero = Integer.valueOf(entrada.readLine()) ;

        }
        imprimir_tabla_multiplicar();

        
    } 
    
    catch (Exception e) {
        System.out.println(e);
    }

 }
 public static void imprimir_tabla_multiplicar(){
     for(int multiplicador = MIN; multiplicador <= MAXMULTIPLICADOR; multiplicador++){
        System.out.println(multiplicador + " * " + valor + " = " + (multiplicador*valor)) ;
     }
 }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Escribir un programa que dado un numero ingresado por el usuario, 
si el numero es natural imprima la tabla de multiplicar de ese numero.*/

public class clase6_ejemplo7 {
    //declaro dos constantes para la tabla de ese n
    public static final int MAXMULTIPLICADOR = 10 ;
    public static final int MIN = 1 ;
    public static void main(String[] args) {

        int numero_natural ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("Ingrese un numero natural") ;
            numero_natural = Integer.valueOf(entrada.readLine()) ;
           while(numero_natural > 0){
               tabla_mult_n(numero_natural);
               System.out.println("Ingrese un numero natural") ;
               numero_natural = Integer.valueOf(entrada.readLine()) ;

            }


            
        } catch (Exception e) {
            System.out.println(e) ;
        }

    }
    //desarrollamos primero la tabla de multiplicar, la definimos como procedimiento, ya que, no retorna nada.
    public static void tabla_mult_n(int numero){ //le pasamos de parametro una variable int numero, ya que, el usuario ingresa cualquier n.
         
        for( int multiplicador = 1; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {
            System.out.println(multiplicador + " * " + numero + " = " + (multiplicador*numero)) ;
        }
    }
    
}

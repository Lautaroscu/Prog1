/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posicion de un numero entero
ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class clase7_ejemplo4 {
    public static final int MAX = 10 ;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String args []){
        //defino variables
        int posicion , numero ;
        int[] arrentero = new int [MAX] ;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;

        try {
            //invoco metodos
            cargar_arreglo_aleatorio(arrentero);
            imprimir_arr(arrentero); 
            System.out.println("ingrese un numero de posicion") ;
            numero = Integer.valueOf(entrada.readLine()) ;
            posicion = encontrar_posicion(arrentero, numero) ;
            if(posicion < MAX) {
                System.out.println(numero +" esta en: " + posicion) ;
            }
            else{
                System.out.println( numero + " no existe") ;
            }

            
        } 
        
        catch (Exception e) {
           System.out.println(e) ;
        }

    }
    public static void cargar_arreglo_aleatorio(int[] arr){
        Random r = new Random();
        for(int pos=0;pos < MAX; pos++){
            arr[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+ MINVALOR);
        }
    }
    public static void imprimir_arr(int[] arr){
        for(int pos=0;pos < MAX; pos++){
            System.out.println("arrentero[" +pos+ "]=>:" + (arr[pos])) ;
        }
        
    }
    public static int encontrar_posicion(int[] arr , int numero){
        int posicion = 0;
        //mientras la posicion sea menos al maximo, y distinta al numero que ingresa
        while((posicion < MAX) && (arr[posicion] != numero)) {
            posicion++ ;

        }
        return posicion ;
    }
   

    
}

/* /*Hacer un programa que dado un arreglo de enteros ordenado creciente de tamano 10 que se encuentra precargado, encuentre la posicion
donde se encuentra un numero entero ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


public class clase7_ejemplo6 {
    public static final int MAX = 10;
    public static final int MAXVALOR= 10;
    public static final int MINVALOR = 1;



    public static void main(String args[]) {
        int numero , posicion ;
        int [] arrentero = new int[MAX] ;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        try {
             cargar_arr_aleatorio(arrentero); 
             imprimir_arr(arrentero); 
             System.out.println("ingrese un numero entero") ;
             numero = Integer.valueOf(entrada.readLine()) ;
             posicion = encontrar_pos_arr(arrentero, numero) ;
             if((posicion < MAX) && (arrentero[posicion] == numero)){
                 System.out.println("la posicion de " + numero + "es " + posicion) ;

             }
            


            
        } 
        
        catch (Exception e) {
            System.out.println(e) ;        }

       

    }
    public static void cargar_arr_aleatorio(int[] arr){
        Random r = new Random();
        for(int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR) ;
        }
    }
    public static void imprimir_arr(int[] arr){
        for(int pos = 0; pos < MAX; pos++) {
            System.out.println("arrenteros["+pos+"]=> " + arr[pos]) ;
        }
    }
    public static int encontrar_pos_arr(int [] arr , int numero) {
        int posicion = 0 ;
        while((posicion < MAX) && (arr[posicion] <numero)){
            posicion++;
        }
        return posicion;
        

    }


    
}

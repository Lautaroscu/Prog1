/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que está en 0 se intercambia
con el que está en 9, el que está en 1 con el que está en 8...). Este intercambio no se debe
realizar de manera explícita, hay que hacer un método que incluya una iteración de
intercambio.*/
import java.util.Random;

public class clase7_ejercicio1 {    
    public static final int MAX = 10;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR = 10;
    public static void main(String args[]) {
        int [] arrenteros = new int[MAX] ;
      
        cargar_arr_aleatorio(arrenteros);
        imprimir_arr_int(arrenteros);
       invertir_sub(arrenteros); 
       System.out.print("\n") ;
        imprimir_arr_int(arrenteros);


        
            }
     public static  void invertir_sub(int[] arr) {
         int aux ;
         for(int i =0; i < MAX/2; i++){
            aux = arr[i] ;
            arr[i] = arr[MAX-1-i] ;
            arr[MAX-1-i] = aux;
         }

         
       

      
     }
     public static void imprimir_arr_int(int [] arr) {
        for(int pos = 0; pos < MAX; pos++){
            System.out.print( arr[pos]+"|"  ) ;
                    
        }
    }
    public static void cargar_arr_aleatorio(int[] arr){
        Random r = new Random();
        for(int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR) ;
        }
    }









}
   
      

    
    


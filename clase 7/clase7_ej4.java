/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posicion de un numero entero
ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase7_ej4 {
 public static final int MAX = 10;
 public static void mian (String[]args) {
     int pos , numero ;
     int [] arrentero ;
     arrentero = new int [MAX];
    
     try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        cargar_arreglo(arrentero);
        imprimir_arreglo_int(arrentero);
        System.out.println("ingrese un numero entero") ;
        numero = Integer.valueOf(entrada.readLine());
       

         
     } 
     
     catch (Exception e) {
        System.out.println(e) ;
     }
     
 }
  public static void cargar_arreglo(int [] arr) {
      for( int pos = 0; pos < MAX; pos++) ;
    
      
           
    }
    public static void imprimir_arreglo_int(int[] arr){
        for( int pos = 0; pos < MAX; pos++) {
            System.out.println("arrentero[" +pos+ "] =>:" + arr[pos] ) ;
        }

    }


}

     

      
  
 

    
  


     
 
    


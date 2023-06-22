/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
encuentra precargado, solicite al usuario el ingreso de dos números
enteros (posiciones del arreglo) y ordene de forma creciente el arreglo
entre dos posiciones correspondientes a los números ingresados. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


public class clase7_ejercicio9 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String args[]) {
        int [] arrenteros = new int[MAX] ;
        int numero , numero1  ;
        cargar_arreglo_aleatorio(arrenteros); 
        imprimir_arr(arrenteros);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        try {
            System.out.println("ingrese un numero entero") ;
            numero = Integer.valueOf(entrada.readLine()) ;
           
            
            System.out.println("ingrese otro numero entero") ;
            numero1 = Integer.valueOf(entrada.readLine()) ;
           
            ordenar_arreglo_burbujeo(arrenteros , numero , numero1);
            
            imprimir_arr(arrenteros);
            
        } 
        
        
        catch (Exception e) {
           System.out.println(e) ;
        }

        

    }
    public static void cargar_arreglo_aleatorio(int[]arr){
        Random r = new Random();
        for(int i = 0; i< MAX; i++){
            arr[i] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR) ;
        }

    }
    public static void imprimir_arr(int[] arr){
        for(int i=0;i<MAX;i++){
            System.out.println("arrenteros["+i+"]=>" + arr[i]);
        }
    }
    public static void ordenar_arreglo_burbujeo(int[]arr , int numero , int numero1) {
        int tmp;
        for (int i = 0; i < MAX-1; i++) {
            for (int j = numero ; j < numero1; j++){
            if (arr[j] > arr[j+1]){
            tmp = arr[j] ;
            arr[j] = arr[j+1] ;
            arr[j+1] = tmp ;
            
        }
    }
}
    }
}
        
       
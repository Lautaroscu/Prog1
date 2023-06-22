/* Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un número igual) en el
arreglo (si existe). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase7_ejercicio8 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String args []) {
        int [] arrenteros = new int[MAX] ;
        int numero , pos ;
        cargar_arreglo_aleatorio(arrenteros); 
        ordenar_arreglo_seleccion(arrenteros); 
        imprimir_arr(arrenteros); 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        try {
            System.out.println("ingrese un numero entero") ;
            numero = Integer.valueOf(entrada.readLine()) ;
            pos = buscar_pos(arrenteros , numero) ;
            if(pos < MAX) {
                System.out.println(numero + " esta en la posicion " + pos) ;
            }
            corrimiento_izq(arrenteros, numero);
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
        public static void ordenar_arreglo_seleccion(int[]arr) {
            int pos_menor, tmp;
            for (int i = 0; i < MAX; i++) {
            pos_menor = i;
            for (int j = i + 1; j < MAX; j++){
            if (arr[j] < arr[pos_menor]) {
            pos_menor = j;
            
            }
            }
            if (pos_menor != i){
            tmp = arr[i];
            arr[i] = arr[pos_menor];
            arr[pos_menor] = tmp;
            }
            }
            }
            public static int buscar_pos(int[]arr , int numero) {
               int pos = 0;
                while((pos < MAX) && (arr[pos] != numero)){
                    pos++ ;
    
    
                }
                return pos ;
            }
            public static void corrimiento_izq(int[] arr , int numero) {
                int indice  = numero ;
                while(indice < MAX-1) {
                    arr[indice] = arr[indice+1] ;
                    indice++ ;
                }
            }
       
    }
    

    


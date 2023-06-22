/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine la primer ocurrencia del numero
(un número igual) en el arreglo (si existe). Para ello tendrá que buscar la posición y si está,
realizar un corrimiento a izquierda (queda una copia de la última posición del arreglo en la
anteúltima posición). */
import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.Random;

public class clase7_ejercicio5 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
        public static final int MINVALOR = 1;

        public static void main(String[]args){
            int   numero , posicion;
            int[] arrentero = new int[MAX] ;
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;

            try {
                cargar_entero_aleatorio(arrentero);
                imprimir_arreglo(arrentero); 
                System.out.println("ingrese un numero entero") ;
                numero = Integer.valueOf(entrada.readLine()) ;
                posicion = encontrar_pos(arrentero, numero);
                if(posicion < MAX){
                    System.out.println("la posicion es " + posicion) ;
                }
                else{
                    System.out.println(numero + " no existe") ;
                }
                corrimiento_izq(arrentero, numero);
                imprimir_arreglo(arrentero);
                
                
            } 
            catch (Exception e) {
                System.out.println(e) ;
            }

        }
        public static void cargar_entero_aleatorio(int[]arr){
            Random r = new Random();
            for(int pos = 0; pos < MAX; pos++) {
                arr[pos] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR) ;
            }

        }
        public static void imprimir_arreglo(int[]arr){
            for(int pos = 0; pos < MAX; pos++) {
                System.out.println("arrentero[" + pos +"] =>: " +(arr[pos])) ;
            }
        }
        public static int encontrar_pos(int[] arr , int numero) {

            int posicion = 0;
            while((posicion < MAX) && (arr[posicion] != numero)){
                    posicion++;
    
    
            }
            return posicion;
        }
        public static void corrimiento_izq(int[]arr , int numero){
            int indice =numero ;
            while(indice < MAX-1) {
                arr[indice] = arr[indice+1] ;
                indice++;
            }
        }


    
}

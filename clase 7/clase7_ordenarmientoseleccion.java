/* Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
y colocar el numero en el arreglo en la posición indicada. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class clase7_ordenarmientoseleccion {
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final int MAX = 10;
    public static void main(String[]args){
        int[] arrenteros = new int[MAX] ;
        int numero ;
        cargar_arreglo_aleatorio(arrenteros); 
        imprimir_arr(arrenteros);
        ordenar_arreglo_seleccion(arrenteros);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        try {
            System.out.println("ingrese un numero entero") ;
            numero = Integer.valueOf(entrada.readLine()) ;
            corrimiento_der(arrenteros, numero);
             arrenteros[numero] = numero ;
          
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
        public static void corrimiento_der(int[] arr , int numero) {
            int indice = MAX-1;
            while(indice > numero){
                arr[indice] = arr[indice-1] ;
                indice--;
            }

        }
    
 
}


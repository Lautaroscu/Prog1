    /* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
    precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
    menor posición del arreglo. */
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.Random;
    public class clase7_ejercicio3{
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
        public static final int MINVALOR = 1;
        public static void main(String[]args){
            int   numero;
            int[] arrentero = new int[MAX] ;
            
            try {
                
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
                cargar_entero_aleatorio(arrentero);
            imprimir_arreglo(arrentero);

                System.out.println("ingrese un numero") ;
                numero = Integer.valueOf(entrada.readLine()) ;
                 corrimiento_izq(arrentero, numero) ;
                 imprimir_arreglo(arrentero);
             

                


                
            } 
            catch (Exception e) {
            
                System.out.println(e);
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
                System.out.print( arr[pos] + "|") ;
            }
        }
        public static void corrimiento_izq(int[]arr, int numero) {
            int indice = numero;
        while(indice < MAX-1) {
            arr[indice] = arr[indice+1] ;
            indice++;
          
            }

                
            

                
                 
            }
           



        }



    
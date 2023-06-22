/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, obtenga la cantidad de números pares que tiene y la imprima.*/ 

    import java.util.Random;
public class clase7_ejercicio2{
    public static final int MAX = 10;
    public static final int MINVALOR = 1;
    public static final int MAXVALOR= 10;
    public static void main(String [] args) {
    

        int[] arrentero ;
        arrentero = new int[MAX] ;
        
        cargar_arr(arrentero);
        imprimir(arrentero);
        
         
        

    }
    public static void cargar_arr( int[] arr) {
        Random r = new Random();
        
        
            for(int pos = 0; pos < MAX; pos++){
                arr[pos] = (r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR) ;
                    
                }
            
    
            
            }
            public static void imprimir(int[]arr){
                for(int pos = 0;pos<MAX; pos++){
                    System.out.println("arrentero["+ pos+ "]=>:" + arr[pos]) ;
                    if(arr[pos] % 2 == 0){
                        System.out.println( "es par") ;
                }
                else if(arr[pos] % 2 != 0) {
                    System.out.println("impar") ;

                }
            }
        
        }
            
    
             

            
        } 

            
        
      
      

       
    
   
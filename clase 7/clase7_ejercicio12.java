import javax.lang.model.element.Element;

/* Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la anteúltima secuencia (considerar comenzar a buscarla a
partir de la ultima posición del arreglo). */
public class clase7_ejercicio12{
    public static final int MAX = 10;
    public static void main(String args[]) {
        int [] arrenteros = {0,3,1,4,0,0,3,1,5,7,0} ;
        int inicio = 0;
        int fin = inicio;
        int anteultsec = 0;
        imprimir_sec(arrenteros);
    }
        public static void imprimir_sec(int[] arr){
            for(int i = 0; i < MAX; i++) {
                System.out.print(arr[i] + "|" ) ;            }
        }
        public static int encontrar_inicio(int[] arr , int pos){
            
    
           while(arr[pos] != 0){
               pos--;
            
        }
        return pos;
    }
        public static int encontrar_fin(int [] arr , int inicio){
            int PosFin = inicio;
            while((PosFin < MAX) && (arr[PosFin] != 0)){
                PosFin++;
            }  
            if(PosFin < MAX){
                return PosFin-1;
            }
            else{
               
                System.out.println("no hay secuencias en esta posicion") ;
                return -1;
            }
        }
      
}

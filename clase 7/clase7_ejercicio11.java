/* 11. Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la secuencia cuya suma de valores sea mayor. */
import java.util.Random ;




class clase7_ejercicio11 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4 ;
    public static void main(String args[]){
        int[] arrenteros = new int[MAX] ;
        int inicio = 0 ;
        int fin = inicio;
        int suma = 0;
        int sumaMAyor = 0;
        int posIniMAyor = 0;
        int posFinMAyor = 0;

        cargar_secuencia_aleatoria(arrenteros);
        imprimir_secuencia_aleatoria(arrenteros); 
       
       while(inicio < MAX){

       

       
            inicio = encontrar_inicio(arrenteros, inicio) ;
            if(inicio != -1){
                fin = encontrar_fin(arrenteros, inicio);
                if(fin != -1){
                    System.out.println("la posicion inicial es " + inicio + "y la final es " + fin);



                    suma = suma_de_secunecias(arrenteros, inicio, fin) ;
                    if(suma > sumaMAyor){
                        sumaMAyor = suma;
                        posIniMAyor = inicio;
                        posFinMAyor = fin;
                    }
                  inicio = fin+1;
                    

                  
                }
                
               
                
                else{
                    inicio = MAX;
                }
            

                System.out.println("la secuencia que mas suma es " + sumaMAyor + " su posicion inicial es " + posIniMAyor + "y su final es " + posFinMAyor);

            

        }

    }
    


        
        }
        public static int encontrar_inicio(int[] arr , int inicio){
            int PosI = inicio;
    
           while((PosI< MAX-1) &&(arr[PosI] == 0)){
               PosI++;
           }
           if(PosI < MAX-1){
               return PosI;
           }
           else{
             
               return -1;
           }
            
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
        public static int suma_de_secunecias( int [] arr , int inicio ,int fin) {
            int suma = 0;
            for(int i = inicio; i <= fin; i++){
                suma+=arr[i] ;
            }
          
            
            return suma;
        }
    
    
    
    
    
    
    
    
    
        public static void cargar_secuencia_aleatoria(int[] arr) {
            Random r = new Random() ;
            arr [0] = 0;
            arr[MAX-1] = 0 ;
            for(int i = 1; i < MAX-1; i++) {
                if(r.nextDouble()>probabilidad_numero){
                    arr[i] = (r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR);
    
                }
                else{
                    arr[i] = 0 ;
                
                } 
            }
        
        }
        public static void imprimir_secuencia_aleatoria(int[] arr) {
            System.out.print("Arreglo de secuencias int\n|");
            for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
            }
            System.out.print("\n");
            }
    
       

    }
   
      
    

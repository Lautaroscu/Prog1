/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra
precargado, imprima por pantalla el promedio de la suma de sus valores.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Clase7_ej3{
    public static final int MAX = 10;
    public static void main(String[] args) {
        int promedio;
        int[] arrint ;
        arrint = new int[MAX] ;
        cargar_arreglo_int(arrint);
        promedio = promedio_arr(arrint) ;
        System.out.println("el promedio de la suma del arreglo es " + promedio) ;
        

    }
    public static void cargar_arreglo_int(int [] arrint) {
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            for(int pos = 0; pos < MAX; pos++){
                System.out.println("ingrese un numero entero") ;
                arrint[pos] = Integer.valueOf(entrada.readLine()) ;  
        } 
    }
        
        catch (Exception e) {
            System.out.println(e) ;
        }
       
    }
    public static int promedio_arr (int [] arrint) {
        int suma = 0;
        for(int pos = 0; pos < MAX; pos++){
            suma+= arrint[pos] ;
            
        }
        return (suma/MAX) ;




    }

}

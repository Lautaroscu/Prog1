/*Hacer un programa que cargue en un arreglo de enteros 5 valores desde teclado y lo imprima
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase7_ejemplo1 {
//declaro variable global constante, ya que pide maximo 5 enteros
public static final int MAX = 5;
public static void main(String[]args) {
    //declaro mi arreglo principal
    int [] arrentero = new int [MAX] ;
    //invoco a los otros metodos
    cargar_arreglo_int(arrentero);
    imprimir_arr_int(arrentero);

}

//hago un metodo para cargar un arreglo por teclado
public static void cargar_arreglo_int(int [] arr1) {

    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        for(int pos = 0; pos < MAX; pos++) {
            System.out.println("ingrese un numero entero");
            arr1[pos] = Integer.valueOf(entrada.readLine()) ;
    }
}
     catch (Exception e) {
      System.out.println(e);
    }
      
}
 //hago otro metodo para imprimir el arregloe
 public static void imprimir_arr_int(int [] arr1) {
     for(int pos = 0; pos < MAX; pos++){
         System.out.println("arrentero[" +pos+ "] =>:" + arr1[pos]  ) ;
                 
     }
 }
}
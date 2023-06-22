public class clase6_ejemplo5{
    //declaro constantes MAX y MIN, ya que las uso en ambos metodos
     public static final int MAX = 1000;
     public static final int MIN = 1 ;

    public static void main(String[] args){
       int promedio ;
       promedio = calcularpromediosuma_1_1000();
       System.out.print(promedio);

    }
    /* Escribir un programa que llame un método que calcule el promedio de la suma
de valores enteres entre 1 y 1000. Finalmente, el promedio debe mostrarse por pantalla.
*/
public static int calcularpromediosuma_1_1000(){
  
   // int promedio ;
    int suma = 0 ;
    for(int i = MIN; i <= MAX; i++){
        suma += i ;
    }
   // promedio = suma/(MAX-MIN+1) ;
   // return promedio ;
   return suma;


}

}
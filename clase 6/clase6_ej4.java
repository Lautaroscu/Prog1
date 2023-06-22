// import java.io.BufferedReader ;
// import java.io.InputStreamReader ;
// public class clase6_ej4 {
//     public static void main(String[] args) {
//         int numero ;
//         try {
//             BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
//             System.out.println("ingrese un numero(0) para salir") ;
//             numero = Integer.valueOf(entrada.readLine()) ;
//             while(numero != 0) {
//                  iterar_1_a_4();
//                  System.out.println("ingrese un numero(0 para salir") ;
//                  numero = Integer.valueOf(entrada.readLine()) ;
            

//             }

//         }
//         catch (Exception e) {
//             System.out.println(e);
//         }

//     }
//     //creo un metodo que imprima por pantalla del 1 al 4 ;
//     public static void iterar_1_a_4() {
//         final int MAX = 4 ;
//         final int MIN = 1 ;
//         for(int i = 1; i <= MAX; i++) {
//             System.out.println("el numero es " + i) ;
//         }

//     }
// }
 /*Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, invoque a un método que imprima si es caracter dígito o
caracter letra minúscula, y si es letra minúscula imprimir si es vocal o
consonante.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class clase6_ejercicio5 {
    
public static void main(String args) {
     char caracter1 ;
     try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println("ingrese un caracter (* para sair)") ;
        caracter1 = entrada.readLine().charAt(0) ;
        while(caracter1 != '*') {
            imprimir_letras(caracter1);
            System.out.println("ingrese un caracter (* para sair)") ;
        caracter1 = entrada.readLine().charAt(0) ;
            
        }

         
     }
      catch (Exception e) {
         System.out.println(e) ;
     }

}
public static void imprimir_letras(char caracter){
    if((caracter >= '1') && (caracter >= '9')) {
        System.out.println( caracter + " es caracter digito") ;
    }
    else if((caracter >= 'a') && (caracter <= 'z')){
        System.out.println(caracter+ " es caracter letra minuscula") ;
    }
    switch(caracter) {
        case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
        System.out.println( caracter + " es caracter vocal") ;
        break;
        default: {
            System.out.println(caracter + " es caracter consonante");
        }
    
    }

    


}
}

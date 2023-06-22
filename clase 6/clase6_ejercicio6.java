/* Escribir un programa que mientras que el usuario ingrese un número entero
natural, llame a un método que calcule la sumatoria entre 1 y dicho
numero y se lo retorne como resultado.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase6_ejercicio6 {
    public static final int MIN = 1;
    

    public static void main(String[] args) {
        int numero_natural ;
         int sumatoria ;
    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println("ingrese un entero natural") ;
        numero_natural = Integer.valueOf(entrada.readLine()) ;
        while(numero_natural != 0){
            sumatoria = calcular_sumatoria_1_n(numero_natural) ;
            System.out.println("La sumatoria entre " + MIN + " y "  + numero_natural + " es " + sumatoria);
            System.out.println("ingrese un entero natural") ;
            numero_natural = Integer.valueOf(entrada.readLine()) ;
           
            

        
        }
        
        
    } catch (Exception e) {
       System.out.println(e) ;
    }
    }
    public static int calcular_sumatoria_1_n(int numero){
       int suma = 0 ;
       
        for(int i = MIN; i <= numero; i++) {
            suma += i ;
        }
        return suma ;

    }
    
}

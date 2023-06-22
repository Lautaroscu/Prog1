/*Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado
imprima:
– “letra minúscula” si el caracter es una letra del abecedario en minúscula;
– “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
– “dígito” si el caracter corresponde a un carácter número;
– “otro” para los restantes casos de caracteres.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class clase6_ejercicio10 {
    public static void main (String[]args){
        int entero ;
        char caracter ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            
            System.out.println("ingrese un numero entero entre 1 y 10") ;
            entero = Integer.valueOf(entrada.readLine()) ;
            while((entero >= 1) && (entero <= 10)) {
                
                System.out.println("ingrese un caracter") ;
                caracter = entrada.readLine().charAt(0) ;
                imprimirifs(caracter);
                System.out.println("ingrese un numero entero entre 1 y 10") ;
                entero = Integer.valueOf(entrada.readLine()) ;

                
            }

        
            
        } 
        catch (Exception e) {
            System.out.println(e) ;
        }

    }

    public static void imprimirifs(char caracter) {
        if((caracter >= 'a') && (caracter <= 'z')) {
            System.out.println("letra minuscula") ;
        }
        else if((caracter >= 'A') && (caracter <= 'Z')) {
            System.out.println("letra mayuscula") ;
        }
        else if((caracter >= '1') && (caracter <= '9')) {
            System.out.println("digito") ;

        }
        else {
            System.out.println("otro") ;
        }
        
            
        
    }
    
    
}


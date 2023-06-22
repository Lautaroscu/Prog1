/*Realizar un programa que dado dos números enteros
ingresados por el usuario, muestre por pantalla el resultado
de las operaciones matemáticas básicas: la suma, la resta,
la multiplicación y la división entre ambos números. */
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class clase6_ejemplo9 {
    public static void main (String[] args) {
        float numero1 ;
        float numero2 ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("ingrese un numero entero") ;
            numero1 = Float.valueOf(entrada.readLine());
            System.out.println("ingrese otro numero entero") ;
            numero2 = Float.valueOf(entrada.readLine());
            operaciones_basicas(numero1, numero2);
            
        } 
        catch (Exception e) {
           System.out.println(e) ;
        }

    }
    public static void operaciones_basicas(float numero1 , float numero2) {
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2)) ;
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2)) ;
        System.out.println(numero1 + " * "  + numero2 + " = " + (numero1*numero2)) ;
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2)) ;

    }
    
}

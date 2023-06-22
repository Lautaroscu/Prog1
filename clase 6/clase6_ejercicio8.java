/* Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase6_ejercicio8{
    public static final int MAXMULTIPLICADOR = 10;
    public static final int MAX = 5;
    public static final int MIN = 1;

    public static void main (String[] args) {
        char letraminus ;
        int entero ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("ingrese una letra minuscula") ;
            letraminus = entrada.readLine().charAt(0) ;
            while((letraminus >= 'a') && (letraminus <= 'z')) {
                System.out.println("ingrese un numero entero") ;
                entero = Integer.valueOf(entrada.readLine()) ;
                while((entero >= MIN) && (entero <= MAX)){
                   

                    tabla_multiplicar(entero);
                    System.out.println("ingrese un numero entero") ;
                    entero = Integer.valueOf(entrada.readLine()) ;

                }

            }
        }
        catch (Exception e) {
            System.out.println(e) ;
        }
    }
    public static void tabla_multiplicar(int numero) {
        for(int i = 1; i <= MAXMULTIPLICADOR; i++) {
            System.out.println(i + " * " + numero + " = " + (i*numero)) ;
        }

    }

}




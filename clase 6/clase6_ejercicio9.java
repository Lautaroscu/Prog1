/* Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operación matemática básica
considerando el valor del carácter. Si ingreso el caracter:
– ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división
entre ambos números. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase6_ejercicio9{
    public static void main (String[] args){
        int numero1 ;
        int numero2 ;
        char caracter ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("ingrese un numero entero") ;
            numero1 = Integer.valueOf(entrada.readLine()) ;
            System.out.println("ingrese otro numero entero") ;
            numero2 = Integer.valueOf(entrada.readLine()) ;
            System.out.println("ingrese 'a' para sumar , 'b' para restar , 'c' para multiplicar y 'd' para dividir") ;
            caracter = entrada.readLine().charAt(0) ;
            operaciones_basicas(caracter, numero1, numero2) ;

           
            
            
        } 
        catch (Exception e) {
           System.out.println(e) ;
        }


    }

    public static void operaciones_basicas( char caracter , int numero1 , int numero2 ) {
        switch(caracter) {
            case 'a' : {
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2)) ;
                break;
            }
            case 'b' :{
                System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2)) ;
                break;
            }
            case 'c' : {
                System.out.println(numero1 + " * "  + numero2 + " = " + (numero1*numero2)) ;
                break;
            }
            case 'd' : {
                System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2)) ;
                break;

            }
        }
      
}
}

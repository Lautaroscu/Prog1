/*Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días) (¿mostrar por pantalla la
cantidad de días del mes debería realizarse con un método? Debería).*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase6_ejercicio7{
    public static void main(String[] args) {
        int entero ;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            System.out.println("ingrese un numero de mes") ;
            entero = Integer.valueOf(entrada.readLine()) ;
            while((entero >= 1) && (entero <= 12)){
                imprimirmeses(entero); 
                System.out.println("ingrese un numero de mes") ;
            entero = Integer.valueOf(entrada.readLine()) ;

            }
            
        } 
        catch (Exception e) {
            System.out.println(e);
        }


    }
    public static void imprimirmeses(int meses){
        switch(meses){
            case 1 : case 3 : case 5 : case 8 : case 10 : case 12 : {
                System.out.println("Este mes tiene 31 dias") ; 
                break;
            }
             case 4 : case 6 : case 7 : case 9 : case 11 : {
                System.out.println ("Este mes tiene 30 dias") ; 
                break;
            }
            case 2 : {
                System.out.println("Tiene 28 dias") ;
                break;    
            }
        }
    }
    




}


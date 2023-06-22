import java.io.BufferedReader ;
import java.io.InputStreamReader ; 

public class clase4_partmeses {
    public static void main (String[]args) {
        int meses ; 
        int anio ;
        try {
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)) ; 
            System.out.println("ingrese un anio") ; 
            anio = Integer.valueOf(entrada.readLine()) ;
            System.out.println("ingrese  un numero de mes") ;
            meses = Integer.valueOf(entrada.readLine()) ; 
            
            
        switch (meses) {
            case 1 : case 3 : case 5 : case 8 : case 10 : case 12 : {
                System.out.println("Este mes tiene 31 dias") ; 
            }
             case 4 : case 6 : case 7 : case 9 : case 11 : {
                System.out.println ("Este mes tiene 30 dias") ; 
            }
            case 2  : {
                if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) 
                System.out.println("tiene 29 dias") ; 
                
                else {
                    System.out.println("tiene 28 dias") ;
                }
            }
               
            
        }


                
    }
    catch (Exception exc) {
        System.out.println(exc) ;
    }

    
}
}

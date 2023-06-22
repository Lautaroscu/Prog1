import java.io.BufferedReader ;
import java.io.InputStreamReader ; 

public class clase5_ej4 {
    public static void main(String[] args){
        char caracter ;
          try{
              BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ;
            
              do{ 

                  System.out.println("ingrese un caracter") ;
              caracter = entrada.readLine().charAt(0) ;
                  if((caracter > '0') && (caracter <= '9')) {
                  System.out.println( caracter + " es caracter digito") ;
                  if((caracter > 'a') && (caracter <= 'z')) ;
                  System.out.println(caracter + " es letra minuscula") ;
                  switch(caracter) {
                      case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : {
                          System.out.println( caracter + " es letra minuscula vocal") ;
                          break ;
                      }
                      default: {
                          System.out.println( caracter + " es letra minuscula consonante") ;
                          break;
                      }


                      }
                  }


                }
                 while(caracter != 0) ;
             } 
              
            catch (Exception exc) {
              System.out.println(exc) ;
          }
        }
            
          
         

    
    }
    


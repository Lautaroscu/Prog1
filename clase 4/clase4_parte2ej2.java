import java.io.BufferedReader ; 
import java.io.InputStreamReader ;



public class clase4_parte2ej2 {
    public static void main(String[] args){
      char caracter ;
      try{
          BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)) ;
          System.out.println("ingrese un caracter") ;
          caracter = entrada.readLine().charAt(0) ;
          if ((caracter >='1') && (caracter <= '9')) {
              System.out.println("es digito") ;
          }
          else  if ((caracter >= 'a') && (caracter <='z'))  {
              System.out.println("es letra minuscula") ;
            
          }
          else {
              System.out.println ("cualquier otro caracter") ;
          }
          switch (caracter)  {
           
            case 'a' : case 'e': case  'i' : case 'o' :  case'u': {
             System.out.println("es vocal") ;
  
               break;
               
            
          }
          
          default: {
              System.out.println("es consonate") ;
             break;
          }
         
         
 
       }
      
       
       


          
    
     
    }
    
                
    

        
      
         
  
      catch (Exception exc) {
          System.out.println(exc);
      }

    







    }
    
}

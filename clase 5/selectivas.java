import java.io.BufferedReader ;
import java.io.InputStreamReader;
public class selectivas {
    public static void main (String[] args) {
        int valor ; 
      
      

       


         
     try {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)) ; 
         valor = Integer.valueOf(entrada.readLine()) ;
         System.out.println("ingrese un numero " + valor ) ;
         if ((valor % 2) == 0 )  {

             System.out.println(valor + " es par") ; 

         }
         
        
     }

     catch (Exception exc) {
         System.out.println(exc) ; 
   
     }

    


                    
                     
            
               

             
                
                       

            
    
    


        }

       

        }
    

    

public class clase6_ej1 {
    public static void main(String[] args){
        iterar_1_a_4();
        System.out.println("termino") ;

    }
    public static void iterar_1_a_4() {
        final int MAX = 4 ;
        for(int numero = 1; numero <= MAX;numero++) {
            System.out.println("el numero es " + numero) ;
        }
    }
}
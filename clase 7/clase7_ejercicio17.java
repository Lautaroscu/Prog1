/* Suponer que se tienen dos arreglos A y B de secuencias (de caracteres separados por uno o
más espacio) de tamaño MAX (arreglo empieza y termina con uno o más caracteres
espacio). A y B que están precargadas, y además se tienen los siguientes métodos (existen y
no se tienen que implementar):
a) un método que permite obtener el índice inicial de la secuencia que más se repite de un
arreglo de secuencias de tamaño MAX (que empieza y termina con o más caracteres
espacios).
b) un método que retorna el índice inicial de la secuencia que tiene más caracteres
repetidos de un arreglo de secuencias (de caracteres separados por uno o más caracteres
espacio) de tamaño MAX (que empieza y termina con espacio).
Se pide realizar un programa completo que (sin utilizar arreglos auxiliares/extras a los
mencionados):
_reemplace en A la secuencia que más se repite por la secuencia de B con más
caracteres repetidos (la separación previa entre las secuencias de A debe mantenerse).
En caso de utilizar uno o más de los métodos preexistentes mencionados en el enunciado
definir el o los encabezados de los mismos. No se requiere hacer métodos de carga e
impresión de arreglos.*/



public class clase7_ejercicio17 {
    public static final int MAX = 20;
    

    public static void main(String args []) {
        char [] arregloA = { '&' , 'a' , 't' , 'u' , '&' , '&' , '5' , 'o' , '&', '&' , 'c' , 'n' , '&' , '#' , '!' , '&' , '&' , '&' , '*' , '&' } ;
        char [] arregloB = { '&' , 'a' , '&' , 'u' , '&' , '&' , '5' , 'o' , '&', '7' , 'c' , 'n' , '&' , '#' , '!' , 'o' , '&' , '&' , '(' , '&' } ;
        System.out.println("Arreglo de secuencias A:") ;
        imprimir_arreglo_char(arregloA);
        System.out.println("\n") ;

        System.out.println("Arreglo de secuencias B:") ;
        imprimir_arreglo_char(arregloB);

    }
    public static void imprimir_arreglo_char(char[] arr) {
        for(int i = 0; i < MAX; i++){
            System.out.print(arr[i] + "|") ;
        }
    }
    
}

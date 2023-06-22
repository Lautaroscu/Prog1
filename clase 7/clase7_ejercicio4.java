
/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo
(posición 0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor
del arreglo) y colocar el numero en el arreglo en la posición indicada.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase7_ejercicio4 {
    public static final int MAX = 20;

    public static void main(String args[]) {
        int pos;
        int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero entero");
            pos = Integer.valueOf(entrada.readLine());
            // insertar_ordenado(arr, pos);
            insertar_ordenado(arr, pos);
            System.out.println(" ");
            imprimir_arr(arr);
        }

        catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void corrimiento_der(int arr[], int pos) {
        int indice = MAX - 1;
        while (indice > pos) {
            arr[indice] = arr[indice - 1];
            indice--;

        }

    }

    public static void insertar_ordenado(int[] arr, int numero) {
        int i = 0;
        while (i < MAX) {
            if (arr[i] > numero) {
                corrimiento_der(arr, i);
                arr[i] = numero;
                return;
            } else
                arr[MAX - 1] = numero;
            i++;
        }

    }

    public static void ordenar_asc(int[] arr) {
        int aux = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = i + 1; j < MAX; j++) {
                if (arr[i] < arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static void imprimir_arr(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
    }

}

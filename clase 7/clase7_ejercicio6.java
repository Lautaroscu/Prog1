
/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero
en el arreglo. Mientras exista (en cada iteración tiene que buscar la posición dentro del
arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán
tantas copias de la última posición del arreglo como cantidad de ocurrencias del número). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class clase7_ejercicio6 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String args[]) {
        int numero;
        int posicion = 0;
        int[] arrenteros = new int[MAX];

        cargar_arr_aleatorio(arrenteros);
        imprimir_arr(arrenteros);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("ingrese un numero entero");
            numero = Integer.valueOf(entrada.readLine());
            posicion = encontrar_pos_arr(arrenteros, numero);

            corrimiento_izq(arrenteros, posicion);

            imprimir_arr(arrenteros);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void cargar_arr_aleatorio(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arr(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("arrenteros[" + pos + "]=> " + arr[pos]);
        }
    }

    public static int encontrar_pos_arr(int[] arr, int numero) {
        int posicion = 0;
        while ((posicion < MAX) && (arr[posicion] != numero)) {
            posicion++;
        }
        return posicion;

    }

    public static void corrimiento_izq(int[] arr, int numero) {
        int indice = numero;
        while (indice < MAX - 1) {
            arr[indice] = arr[indice + 1];
            indice++;
        }
    }

}

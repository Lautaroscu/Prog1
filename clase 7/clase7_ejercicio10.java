
/*Se tiene un arreglo de enteros de tamaño 20 de secuencias de números
entre 1 y 9, separadas por 0. El arreglo esta precargado, y además
empieza y termina con uno o más separadores 0. Hacer un programa que
permita obtener a través de métodos la posición de inicio y la posición de
fin de la secuencia ubicada a partir de una posición entera ingresada por
el usuario. Finalmente, si existen imprima por pantalla ambas posiciones
obtenidas.*/
import java.util.Random;

public class clase7_ejercicio10 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String args[]) {
        int[] arrenteros = new int[MAX];

        int inicio = 0;
        int fin = 0;
        cargar_secuencia_aleatoria(arrenteros);
        imprimir_secuencia_aleatoria(arrenteros);

        inicio = encontrar_inicio(arrenteros, fin + 1);

        if (inicio < MAX) {
            fin = obtener_fin(arrenteros, inicio);

            if (fin < MAX) {
                System.out.println("su inicio de secuencia es " + inicio + " y su fin es " + fin);
            }

        }

    }

    public static void cargar_secuencia_aleatoria(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int i = 1; i < MAX - 1; i++) {
            if (r.nextDouble() > probabilidad_numero) {
                arr[i] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);

            } else {
                arr[i] = 0;

            }
        }

    }

    public static void imprimir_secuencia_aleatoria(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static int encontrar_inicio(int[] arr, int inicio) {
        int pos = 0;
        while ((pos < MAX - 1) && (arr[pos] == 0)) {
            pos++;
        }
        if (pos < MAX - 1) {
            return pos;
        } else {
            System.out.println("no hay secuencia en esa posicion");
            return -1;
        }

    }

    public static int obtener_fin(int[] arr, int fin) {
        int pos = fin;
        while ((pos < MAX) && (arr[pos] != 0)) {
            pos++;
        }
        if (pos < MAX) {
            return pos - 1;

        } else {
            return -1;
        }
    }

}

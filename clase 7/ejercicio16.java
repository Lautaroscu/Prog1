/* 
 * Hacer un programa que dado el arreglo definido y precargado elimine todas las
secuencias que tienen orden descendente entre sus elementos.
 */

public class ejercicio16 {
    public static final int MAX = 20;

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 3, 4, 0, 6, 6, 4, 3, 0, 6, 5, 4, 3, 0, 8, 5, 0 };
        imprimir_arreglo(arr);
        eliminar_sec_orden_desc(arr);
        System.out.println("\n");
        imprimir_arreglo(arr);
    }

    public static void eliminar_sec_orden_desc(int[] arr) {
        int inicio = 0;
        int fin = 0;
        while (inicio < MAX) {
            inicio = obtener_inicio_secuencia(arr, fin + 1);
            if (inicio < MAX) {
                fin = obtener_fin_secuencia(arr, inicio);
                if (fin < MAX) {
                    // en caso de que haya una secuencia con inicio y fin, comprobariamos en que
                    // orden esta.
                    if (es_decendente(arr, inicio, fin)) {
                        int tamanio = fin - inicio + 1;
                        while (tamanio > 0) {
                            corrimiento_izq(arr, inicio);
                            tamanio--;
                        }
                        fin = inicio - 1;
                    }

                }
            }
        }
    }

    private static void corrimiento_izq(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static boolean es_decendente(int[] arr, int inicio, int fin) {
        while (inicio < fin) {
            if (arr[inicio] > arr[inicio + 1]) {
                return true;
            }
            inicio++;

        }
        return false;

    }

    public static int obtener_inicio_secuencia(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtener_fin_secuencia(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
    }
}

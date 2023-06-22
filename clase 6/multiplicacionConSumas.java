import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.lang.*;

public class multiplicacionConSumas {
    public static final double claveA = Math.floor(Math.random() * 1000);
    public static final double claveB = Math.floor(Math.random() * 100);
    public static final double claveC = Math.floor(Math.random() * 10);

    public static void main(String[] args) {

        int unidad;
        int decena;
        int centena;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese una unidad");
            unidad = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese una decena");
            decena = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese una centena");
            centena = Integer.valueOf(entrada.readLine());
            System.out.println(cantidadCorrectos(unidad, decena, centena));

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int cantidadCorrectos(int unidad, int decena, int centena) {
        int correctos = 0;
        if (centena == claveA || decena == claveB || unidad == claveC) {
            correctos++;
        }
        return correctos;
    }

}

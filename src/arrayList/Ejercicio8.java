import java.util.ArrayList;

public class Ejercicio8 {

    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int numero = (int) (Math.random() * 20) + 1;
            numeros.add(numero);
        }
        return numeros;
    }

    public static int[] calcularFrecuencias(ArrayList<Integer> numeros) {
        int[] frecuencias = new int[20];
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            frecuencias[numero - 1]++;
        }
        return frecuencias;
    }

    public static void imprimirTabla(int[] frecuencias) {
        System.out.println("numero\tFrecuencia");
        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + "\t" + frecuencias[i]);
        }
    }

    public static int numeroMayor(int[] frecuencias) {
        int mayor = frecuencias[0];
        int numero = 1;
        for (int i = 1; i < 20; i++) {
            if (frecuencias[i] > mayor) {
                mayor = frecuencias[i];
                numero = i + 1;
            }
        }
        return numero;
    }
    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        System.out.println("numeros generados:");
        System.out.println(numeros);

        int[] frecuencias = calcularFrecuencias(numeros);

        System.out.println();
        imprimirTabla(frecuencias);

        System.out.println();
        System.out.println("El numero que mas se repite es: "
                + numeroMayor(frecuencias));
    }
}

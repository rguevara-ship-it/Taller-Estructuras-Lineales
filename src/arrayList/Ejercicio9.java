import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9 {

    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = aleatorio.nextInt(100) + 1;
            numeros.add(numero);
        }
        return numeros;
    }

    public static void imprimirLista(String nombre, ArrayList<Integer> lista) {
        System.out.println(nombre + ": " + lista);
    }

    public static void ordenarMenorMayor(ArrayList<Integer> lista) {
        Collections.sort(lista);
    }

    public static void ordenarMayorMenor(ArrayList<Integer> lista) {
        Collections.sort(lista, Collections.reverseOrder());
    }

    public static ArrayList<Integer> obtenerPares(ArrayList<Integer> numeros) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        return pares;
    }

    public static ArrayList<Integer> obtenerImpares(ArrayList<Integer> numeros) {
        ArrayList<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }
        return impares;
    }
    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        imprimirLista("Lista original", numeros);

        ordenarMenorMayor(numeros);
        imprimirLista("Menor a mayor", numeros);

        ordenarMayorMenor(numeros);
        imprimirLista("Mayor a menor", numeros);

        ArrayList<Integer> pares = obtenerPares(numeros);
        ArrayList<Integer> impares = obtenerImpares(numeros);

        imprimirLista("numeros pares", pares);
        imprimirLista("numeros impares", impares);
    }
}

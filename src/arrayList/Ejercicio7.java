import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static ArrayList<Integer> generarParesAscendentes() {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i * 2);
        }
        return numeros;
    }

    public static void imprimir(ArrayList<Integer> numeros) {
        System.out.println(numeros);
    }

    public static void insertarOrdenado(ArrayList<Integer> numeros, int numero) {
        int posicion = 0;

        while (posicion < numeros.size() && numeros.get(posicion) < numero) {
            posicion++;
        }
        numeros.add(posicion, numero);
    }

    public static void borrarNumero(ArrayList<Integer> numeros, int numero) {
        numeros.remove(Integer.valueOf(numero));
    }
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        ArrayList<Integer> numeros = generarParesAscendentes();

        System.out.println("ArrayList inicial:");
        imprimir(numeros);

        System.out.print("De un numero para insertar: ");
        int nuevo = lea.nextInt();

        insertarOrdenado(numeros, nuevo);

        System.out.println("ArrayList despues de insertar:");
        imprimir(numeros);

        System.out.print("Ingrese un numero para borrar: ");
        int borrar = lea.nextInt();

        borrarNumero(numeros, borrar);

        System.out.println("ArrayList despues de borrar:");
        imprimir(numeros);
    }
}


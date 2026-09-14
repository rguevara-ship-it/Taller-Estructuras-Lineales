import java.util.ArrayList;

public class Ejercicio6 {

    public static ArrayList<Integer> generarNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        do {
            numero = (int) (Math.random() * 21) - 10;
            if (numero != 10) {
                numeros.add(numero);
            }
        } while (numero != 10);
        return numeros;
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            suma = suma + numeros.get(i);
        }
        return suma;
    }

    public static double calcularMedia(ArrayList<Integer> numeros) {
        int suma = calcularSuma(numeros);

        return (double) suma / numeros.size();
    }

    public static void imprimir(ArrayList<Integer> numeros) {
        System.out.println("numeros leidos:");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        imprimir(numeros);

        System.out.println("Suma: " + calcularSuma(numeros));
        System.out.println("Media: " + calcularMedia(numeros));
    }
}

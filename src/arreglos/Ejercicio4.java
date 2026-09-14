public class Ejercicio4 {

    public static int[] generarNumeros() {
        int[] numeros = new int[25];

        for (int i = 0; i < 25; i++) {
            numeros[i] = (int) (Math.random() * 101) - 50;
        }

        return numeros;
    }

    public static int encontrarnumeroMenor(int[] numeros) {
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }

    public static int encontrarnumeroMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static void imprimir(int[] numeros) {
        System.out.println("numeros del arreglo:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] numeros = generarNumeros();

        imprimir(numeros);

        System.out.println("numero menor: " + encontrarnumeroMenor(numeros));
        System.out.println("numero mayor: " + encontrarnumeroMayor(numeros));
    }
}

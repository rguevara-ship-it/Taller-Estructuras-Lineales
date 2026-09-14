public class Ejercicio5 {

    public static int[] generarNumeros() {
        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }
        return numeros;
    }

    public static int[] invertirNumeros(int[] numeros) {
        int[] invertidos = new int[20];

        for (int i = 0; i < numeros.length; i++) {

            int numero = numeros[i];
            int invertido = 0;

            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }
            invertidos[i] = invertido;
        }
        return invertidos;
    }

    public static void imprimir(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        int[] numeros = generarNumeros();

        int[] invertidos = invertirNumeros(numeros);

        System.out.println("Orden original:");
        imprimir(numeros);

        System.out.println("Orden invertido:");
        imprimir(invertidos);
    }
}

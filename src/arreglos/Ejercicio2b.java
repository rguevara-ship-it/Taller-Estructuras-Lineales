public class Ejercicio2b {

    public static int[] generarPares() {

        int[] pares = new int[100];

        for (int i = 0; i < 100; i++) {
            pares[i] = (i + 1) * 2;
        }
        return pares;
    }

    public static void imprimir(int[] pares) {

        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("Linea " + ((i / 10) + 1)+" ");
            }
            System.out.print(pares[i] + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {

        int[] pares = generarPares();

        imprimir(pares);
    }
}


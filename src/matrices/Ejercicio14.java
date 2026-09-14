public class Ejercicio14 {

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] transpuesta(int[][] matriz) {

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 8, 4},
            {9, 3, 5}
        };

        int[][] matrizTranspuesta = transpuesta(matriz);

        System.out.println("Matriz inicial:");
        imprimirMatriz(matriz);

        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(matrizTranspuesta);
    }
}

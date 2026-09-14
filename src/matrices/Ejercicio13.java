import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

    public static void llenarMatriz(int[][] matriz) {
        Random aleatorio = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean esSimetrica(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void imprimirEsquinas(int[][] matriz) {

        int n = matriz.length;

        System.out.println("\nnumeros de las esquinas:");

        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][n - 1]);
        System.out.println("Esquina inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Esquina inferior derecha: " + matriz[n - 1][n - 1]);
    }
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        System.out.print("Dame el tamaño de la matriz: ");
        int n = lea.nextInt();

        int[][] matriz = new int[n][n];

        llenarMatriz(matriz);

        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("\nLa matriz es simetrica.");
        } else {
            System.out.println("\nLa matriz no es simetrica.");
        }

        imprimirEsquinas(matriz);

        lea.close();
    }
}

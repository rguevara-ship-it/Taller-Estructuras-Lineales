import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

    public static void llenarMatriz(int[][] matriz) {
        Random aleatorio = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void intercambiarFilas(int[][] matriz) {

        int[] temporal = matriz[0];

        matriz[0] = matriz[1];

        matriz[1] = temporal;
    }
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int m = lea.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int n = lea.nextInt();

        if (m < 2) {
            System.out.println("La matriz debe tener minimo 2 filas.");
            return;
        }

        int[][] matriz = new int[m][n];

        llenarMatriz(matriz);

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        intercambiarFilas(matriz);

        System.out.println("\nINTERCAMBIO");
        imprimirMatriz(matriz);

        lea.close();
    }
}

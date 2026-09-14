import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

    public static void llenarMatriz(int[][] matriz) {
        Random aleatorio = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(101) - 50;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumarDiagonalOpuesta(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma = suma + matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        System.out.print("Dame el tamaño de la matriz: ");
        int n = lea.nextInt();

        int[][] matriz = new int[n][n];

        llenarMatriz(matriz);

        imprimirMatriz(matriz);

        int suma = sumarDiagonalOpuesta(matriz);

        System.out.println("La suma de la diagonal opuesta es: " + suma);

        lea.close();
    }

}

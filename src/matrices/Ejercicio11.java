import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    public static void llenarMatriz(int[][] matriz) {
        Random aleatorio = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
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

    public static void buscarNumero(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("El numero " + numero
                            + " se encuentra en la posicion: "
                            + "fila " + i + ", columna " + j);
                    return;
                }
            }
        }
        System.out.println("El numero " + numero + " no se encuentra en la matriz.");
    }

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int m = lea.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int n = lea.nextInt();

        int[][] matriz = new int[m][n];

        llenarMatriz(matriz);
        imprimirMatriz(matriz);

        System.out.print("Ingrese el numero que desea buscar: ");
        int numero = lea.nextInt();

        buscarNumero(matriz, numero);

        lea.close();
    }
}

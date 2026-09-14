public class Ejercicio3 {
    
    public static int[] generarNumeros(int n) {
        int[] numeros = new int[n];
        Math.random();

        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1; 
        }

        return numeros;
    }

    public static int[] calcularFactoriales(int[] numeros) {
        int[] factoriales = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            int factorial = 1;

            for (int j = 1; j <= numeros[i]; j++) {
                factorial = factorial * j;
            }

            factoriales[i] = factorial;
        }

        return factoriales;
    }

    public static void imprimirNumeros(int[] numeros) {
        System.out.println("numeros iniciales:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }

    public static void imprimirFactoriales(int[] factoriales) {
        System.out.println("Factoriales:");

        for (int i = 0; i < factoriales.length; i++) {
            System.out.print(factoriales[i] + " ");
        }
    }
    public static void main(String[] args) {

        int n = 5;

        int[] numeros = generarNumeros(n);

        int[] factoriales = calcularFactoriales(numeros);

        imprimirNumeros(numeros);

        imprimirFactoriales(factoriales);
    }
}

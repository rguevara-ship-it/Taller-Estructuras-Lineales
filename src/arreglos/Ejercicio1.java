public class Ejercicio1 {
    
    public static int[] imprimirPrimos() {
        int[] primos = new int[10];
        int contador = 0;
        int numero = 2;

        while (contador < 10) {
            boolean primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        return primos;
    }

    public static void imprimir(int[] primos) {
        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i]);
        }
    }

    public static void main(String[] args) {

        int[] primos = imprimirPrimos();

        imprimir(primos);
    }
}

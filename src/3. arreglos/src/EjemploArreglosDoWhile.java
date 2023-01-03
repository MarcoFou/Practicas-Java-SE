import java.util.Arrays;

public class EjemploArreglosDoWhile {
    public static void main(String[] args) {

        // Diseño de un String Array
        String[] productos = new String[7]; // Reservo 7 espacios de memoria de tipo string para el arreglo productos

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung";
        productos[2] = "Disco SSD";
        productos[3] = "ASUS Notebook";
        productos[4] = "MacBook A IR";
        productos[5] = "Chrome Cast Pendrive";
        productos[6] = "Bicicleta";

        for (String prod : productos) { // ejecuta la función callback una vez por cada elemento del array
            System.out.println("prod = " + prod);
        }

        int[] numeros = new int[10];

        numeros[0] = -32;
        numeros[1] = 38;
        numeros[2] = 75;
        numeros[3] = 61;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        for (int num : numeros) {
            System.out.println("numero [" + "] = " + num);
        }

    }
}
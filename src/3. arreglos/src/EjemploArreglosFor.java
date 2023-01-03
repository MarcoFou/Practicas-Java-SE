import java.util.Arrays;

public class EjemploArreglosFor {
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

        Arrays.sort(productos);

        int total = productos.length; // [.Length] me lee el tamano del arreglo, en este caso "7"

        for (int i = 0; i <= total - 1; i++) { // aqui le resto -1 xq el primer espacio es Cero

            System.out.println("para indice " + i + " : " + productos[i]);

        }

        int[] numeros = new int[10];

        numeros[0] = -32;
        numeros[1] = 38;
        numeros[2] = 75;
        numeros[3] = 61;

        // Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("numero [1] = " + i);
        System.out.println("numero [2] = " + j);
        System.out.println("numero [3] = " + k);
        System.out.println("numero [4] = " + l);

    }
}
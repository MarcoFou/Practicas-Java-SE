import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        // Diseño de un String Array
        String[] productos = new String[7]; // Reservo 7 espacios de memoria de tipo string para el arreglo productos

        // asigno valores por defecto a las posiciones de mem del array, si no lo defino
        // queda en null.
        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung";
        productos[2] = "Disco SSD";
        productos[3] = "ASUS Notebook";
        productos[4] = "MacBook A IR";
        productos[5] = "Chrome Cast Pendrive";
        productos[6] = "Bicicleta";

        // imprimo por consola
        System.out.println("producto [1] = " + productos[0]);
        System.out.println("producto [2] = " + productos[1]);
        System.out.println("producto [3] = " + productos[2]);
        System.out.println("producto [4] = " + productos[3]);
        System.out.println("producto [5] = " + productos[4]);
        System.out.println("producto [6] = " + productos[5]);
        System.out.println("producto [7] = " + productos[6]);
        System.out.println("\n\n");

        // Utilizo la clase Array para usar el metodo sort para ordenar alfab.
        Arrays.sort(productos);

        // Elementos del arreglo
        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        // imprimo por consola
        System.out.println("producto [1] = " + prod1);
        System.out.println("producto [2] = " + prod2);
        System.out.println("producto [3] = " + prod3);
        System.out.println("producto [4] = " + prod4);
        System.out.println("producto [5] = " + prod5);
        System.out.println("producto [6] = " + prod6);
        System.out.println("producto [7] = " + prod7);
        System.out.println("\n\n");

        int[] numeros = new int[4];

        numeros[0] = -32;
        numeros[1] = 38;
        numeros[2] = 75;
        numeros[3] = 61;

        Arrays.sort(numeros);

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
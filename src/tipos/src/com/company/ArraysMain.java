package com.company;

public class ArraysMain {

    public static void main(String[] args) {

        String nombre1 = "nombre1";
        String nombre2 = "nombre2";
        String nombre3 = "nombre3";

        // Estructuras de datos: String[] = new String [tamano del array]
        String[] nombres = new String[3];
        String[] nombres2 = new String[]{nombre1, nombre2, nombre3};

        int[] numeros = new int[5];
        Coche[] coches = new Coche[2]; // tambien se puede crear un Array de Clase

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        //para recorrer un array e imprimirlos en consola el metodo length muestra longitud del vector
        for(int i=0; i < nombres.length; i++){

            System.out.println(nombres[i]);

        }

        System.out.println("\n");

        for(int j=0; j < nombres2.length; j++){

            System.out.println(nombres[j]);

        }


    }
}

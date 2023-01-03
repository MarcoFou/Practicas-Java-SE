package com.company;

//Un arrayList es una lista dinamica, una estructura de datos

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        //bucle for each for(tipoDeDato varTemporal : nombreDelArray)
        for (String nombre : nombres) {

            System.out.println(nombres);

        }

        System.out.println(nombres);

        // ArrayList de objetos

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Honda"));
        coches.add(new Coche("Alfa Romeo"));
        coches.add(new Coche("Ford"));

        System.out.println(coches);

        System.out.println("\n");

        for (Coche coche: coches) {
            System.out.println(coche);
        }

    }
}

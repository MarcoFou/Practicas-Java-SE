package com.company;

public class Coche {

    String name = "Nombre de coche";

    public Coche(){

    }

    public Coche(String name){
        this.name = name;
    }


//Generate ToString para que me poermita imprimir por consola
    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}

package poo.clases;

import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

    // Creacion de los objetos utilizando el constructor vacio:

        // Clase identificador = new Clase
        Vehiculo toyotaPrius = new Vehiculo();

    // Creacion de los objetos utilizando el constructor con parametros
        Motor motorGTI = new Motor("GTI",190,459.0,6);
        Vehiculo fordMondeo = new Vehiculo("ford", "Mondeo", 2.1, 2010, false,100.0, 1, motorGTI);

        System.out.println(fordMondeo.fabricante);

        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";
        }
}

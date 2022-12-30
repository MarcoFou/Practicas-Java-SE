package poo.con_interfaces;

import poo.sin_interfaces.Empleado;


public class Main {

    // Instansiacion de los objetos:
                                         //******************** EmpleadoCRUDMySQL es la implementacion o clase, que es intercambiable
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();
                                         //******************** static EmpleadoCRUD es la Abstraccion o interface
    // Metodo main:
    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());


    }
}

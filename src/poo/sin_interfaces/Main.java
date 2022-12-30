package poo.sin_interfaces;

// ejemplo con una base de datos local sin persistencia, es decir que se almacena en la memoria ram y no en el disco.

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instanciacion
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado sheila = new Empleado("Sheila", 30, 40000, true);
        Empleado croata = new Empleado("Croata", 30, 40000, true);

        // Insersion de informacion al ArrayList
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(sheila);
        empleadoCRUD.save(croata);

        // Consulta de datos
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
        System.out.println(juanito);


    }
}

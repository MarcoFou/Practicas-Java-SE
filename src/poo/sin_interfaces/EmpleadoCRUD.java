package poo.sin_interfaces;

import java.util.ArrayList;
import java.util.List;
public class EmpleadoCRUD {

    // Atributos:

 // Diseno de un objeto tipo EmpleadoArrayList de la clase List, para almacenar los datos de los empleados.

    // Estructura de datos
    private List <Empleado> empleados = new ArrayList<>();



    // Metodos: Operaciones CRUD

// CREATE - guardar un empleado
    public void save(Empleado empleado){                // Empleado es el tipo de dato del objeto empleado

        empleados.add(empleado);       // esto lo que hace es guardar dentro de la estructura de datos (objeto) empleados

    }
// QUERY - consulta de empleados
    public List<Empleado> findAll(){

        return empleados;

    }

}

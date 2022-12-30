package poo.con_interfaces;

import poo.sin_interfaces.Empleado;

import java.util.List;

/**
 * Para hacer herencias se utiliza la palabra [extends] y para interfaces [implements]
 *
 * Para generar los metodos debo posicionarme sobre la palabra [implements] y hacer click en implements methods
 */

public class EmpleadoCRUDMySQL implements EmpleadoCRUD, EmpleadoReader {


    @Override
    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}

package poo.con_interfaces;

import poo.sin_interfaces.Empleado;

import java.util.List;

/**
 *  Las interfaces solo declaran metodos, no se implementan.
 *
 *  Actua como un contrato, dice lo que hay que hacer pero no lo hace, es como un puente con el codigo que implementa
 *
 *
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado>findAll();

    void delete(Empleado empleado);
}

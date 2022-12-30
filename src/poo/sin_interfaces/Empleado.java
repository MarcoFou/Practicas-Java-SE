package poo.sin_interfaces;

public class Empleado {

    // 1. Atributos
    String nombre;
    int edad;
    double salario;
    boolean activo;

    // 2. Constructores
   public Empleado (){

   };

    public Empleado(String nombre, int edad, double salario, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.activo = activo;
    }

    // 3. Metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", activo=" + activo +
                '}';
    }
}

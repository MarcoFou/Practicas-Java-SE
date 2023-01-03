package Main;

//Importo paquetes xq estoy llamando a las clases desde afuera de su empaquetado
import org.poo_herencia.Alumno;
import org.poo_herencia.Profesor;
import org.poo_herencia.Persona;


public class HerenciaMain {

    public static void main(String[] args) {

        Persona alumno = new Alumno();
        alumno.setNombre("Marco");
        alumno.setApellido("Fouad");
        //alumno.ejemploProtected;



        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("Alumno: " + alumno.getNombre());
    }
}

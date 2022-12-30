package bases.nombredeempresa.estructuras_de_control_y_repeticion.de_repeticion;

// LA DIFERENCIA ENTRE FOR Y WHILE ES QUUE WHILE ES UN BUCLE INDETERMINADO
public class While {
    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10){
            System.out.println("Hola mundo" + contador);
            contador++;

            //esto rompe la indeterminacion del bucle
            if (contador == 5){
                //break;
                continue;
            }

            System.out.println("Valor del contador " + contador);

        }
    }

}

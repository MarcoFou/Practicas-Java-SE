package bases.nombredeempresa.estructuras_de_control_y_repeticion.de_repeticion;

public class For {
    public static void main(String[] args) {

        // recorrer o iterar un array de String utilizando for.

        String[] nombres = {"Huevito", "Bono", "Teo", "Fibonacci", "Solar"}; //length = 5


        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
         }
    }
}

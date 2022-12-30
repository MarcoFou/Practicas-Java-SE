package bases.nombredeempresa.estructuras_de_control_y_repeticion.de_repeticion;

public class ForEach {
    public static void main(String[] args) {
        String [] nombres = {"pepe", "juanito", "ruperta"};

        int[] numeros = {1,43,5,2,3,42};

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        int suma = 0;
        for(int numero : numeros){
            suma += numero; // sobreescribe el valor suma a suma+numero
            System.out.println(suma);
        }
    }
}

package bases.nombredeempresa.tipos_de_datos_y_funciones;

// la sobrecarga permite duplicar un metodo o funcion, se hace cuando la funcion se llama igual pero cambian los parametros

public class Sobrecarga {
    public static void main(String[] args) {
        int resultado = Suma(5,5);
        int resultado2 = Suma(190,2,4);
        System.out.println("AJAAAAAAAAAAAAAAAAAAA..........." + resultado2);
        System.out.println(resultado);

    }

    static int Suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    static int Suma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
}

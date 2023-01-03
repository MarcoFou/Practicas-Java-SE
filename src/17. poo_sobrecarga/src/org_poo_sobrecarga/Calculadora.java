package org_poo_sobrecarga;

public class Calculadora {

    //Sobrecarga del metodo sumar: llama al metodo que corresponda segun los argumentos ingresados

    public int sumar (int a, int b){
        return a + b;
    }

    public float sumar(float x, float y){
        return x + y;
    }

    public float sumar( int i, float j){
        return i + j;
    }

    public float sumar( float i, int j){
        return i + j;
    }

    public double sumar(double i, double j){
        return i+j;
    }

    // Prevenir errores si se ingresan caracteres
    public int sumar(String a, String b){
        int resultado;
                try {

                    resultado = Integer.parseInt(a) + Integer.parseInt(b);
                } catch (NumberFormatException e) {
                    resultado = 0;
                }
        return Integer.parseInt(a) + Integer.parseInt(b);

    }

    public int sumar(int a, int b, int c){
        return a + b + c;
    }

}

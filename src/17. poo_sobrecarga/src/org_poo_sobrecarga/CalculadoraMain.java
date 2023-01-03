package org_poo_sobrecarga;

public class CalculadoraMain {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Detecta el metodo sobrecargado que corresponde por los argumentos
        System.out.println("Sumar int : " + calc.sumar(10,5));
        System.out.println("Sumar int : " + calc.sumar(10.5F,5F));
        System.out.println("Sumar int : " + calc.sumar(10F,5));
        System.out.println("Sumar int : " + calc.sumar(10,5.0F));
        System.out.println("Sumar int : " + calc.sumar(10.0,5.0));
        System.out.println("Sumar int : " + calc.sumar("10","5"));
        System.out.println("Sumar int : " + calc.sumar(10,5,3));

        System.out.println("Sumar int : " + calc.sumar(10l,5l));// no tengo metodos con long pero se asigna al tipo de dato mas compatible si lo hubiera
        System.out.println("Sumar int : " + calc.sumar(10,'@'));
        System.out.println("Sumar int : " + calc.sumar(10f, '@')); // cada caracter tiene su representacion num entera en unicode. @ se representa con el numero 64 en Unicode

    }
}

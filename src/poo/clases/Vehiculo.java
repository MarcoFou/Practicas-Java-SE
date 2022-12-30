package poo.clases;

// La POO emula los objetos de la realidad en codigo
// modificadores de visibilidad: public, private, protected. private no permite acceder direc. desde fuera de su clase
// Normalmente se disena un constructor vacio y otro con todos los parametros

public class Vehiculo {

    // 1. Atributos
   protected String modelo;
    protected String fabricante;
    protected  double cc;
    protected  int year;
    protected  boolean sport;
    protected  double acelerar;
    protected double speed;

    Motor motor;

    //2. Constructores: son metodos que permiten construir los objetos a partir de una plantilla, su caracteristica es
    // que recibe el mismo nombre de la clase.

    public Vehiculo(String modelo, String fabricante, double cc, int year, boolean sport, double acelerar, double speed, Motor motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.acelerar = acelerar;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(){

    }


    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

//Constructor generado con click derecho => Generate
    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    //3. Metodos: comportamiento
    public void acelerar(double quantity){
        this.speed += quantity;
    }
}

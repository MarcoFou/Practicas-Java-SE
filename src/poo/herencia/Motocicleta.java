package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    // Atributos
boolean baul;

    // Constructores
    public Motocicleta() {

    }
    public Motocicleta(boolean baul) {
        this.baul = baul;
    }

    public Motocicleta(String modelo, String fabricante, double cc, int year, boolean sport, double acelerar, double speed, Motor motor, boolean baul) {
        super(modelo, fabricante, cc, year, sport, acelerar, speed, motor);
        this.baul = baul;
    }

    // Metodos
}

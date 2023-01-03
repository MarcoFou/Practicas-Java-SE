package org.poo_herencia;

public class Alumno extends Persona{

    // protected String nombre; // el  Encapulamiento [protected] permite acceder a su desendencia, siempre que este dentro del package

    private String imstitucion;
    private String notaMatematica;
    private String notaCastellano;
    private String notaHistoria;

    public String getImstitucion() {
        return imstitucion;
    }

    public void setImstitucion(String imstitucion) {
        this.imstitucion = imstitucion;
    }

    public String getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(String notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public String getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(String notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public String getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(String notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}

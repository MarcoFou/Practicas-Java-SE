//DEFINO EL ESTADO DEL OBJETO "AUTOMOVIL" DESCRIPCION DE LOS ATRIBUTOS DEL OBJETO CREADO
//ESTOS ATRIBUTOS SON PUBLICOS; DESPUES ACCEDO A ESTOS ATRIBUTOS DE FORMA DIRECTA, ESTAS DEFINICIONES SON POR DEFAULT

//Diseno el constructor de mi objeto "La clase" cin sus atributos

public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;
    
// CREACION DE UN METODO 
    public void detalle(){
        //aqui puedo definir una variable interna  y cambiarla por "this"
         System.out.println("auto.fabricante = " + this.fabricante);
         System.out.println("auto.fabricante = " + this.modelo);
         System.out.println("auto.fabricante = " + this.color);
         System.out.println("auto.fabricante = " + this.cilindrada);
         System.out.println();
    }
}

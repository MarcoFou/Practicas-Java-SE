public class EjemploAutomovil {


    public static void main(String[] args) {
        
        Automovil subaru = new Automovil(); // Diseno del primer objeto -- Instanciacion del objeto
        subaru.fabricante = "subaru";
        subaru.modelo = "impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";
        
         Automovil mazda = new Automovil(); // Diseno del 2do objeto -- Instanciacion del objeto. Constructor: Automovil
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-500";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";
/*
        System.out.println("auto.fabricante = " + subaru.fabricante);
        System.out.println("auto.fabricante = " + subaru.modelo);
        System.out.println("auto.fabricante = " + subaru.color);
        System.out.println("auto.fabricante = " + subaru.cilindrada);
        
        System.out.println();
        
        System.out.println("auto.fabricante = " + mazda.fabricante);
        System.out.println("auto.fabricante = " + mazda.modelo);
        System.out.println("auto.fabricante = " + mazda.color);
        System.out.println("auto.fabricante = " + mazda.cilindrada);
*/
        // uso metodos para un codigo mucho mas prolijo
        subaru.detalle();
        mazda.detalle();

    }
    
}

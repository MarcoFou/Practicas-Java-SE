// Se les puede llamar metodos o funciones, son lo mismo solo que cuando se refiere a un objeto se le llama metodo

// [void] indica que la funcion va a retornar null, realiza instrucciones internas
// [static] la funcion va a ser llamada desde el [main] que contiene static.

package bases.nombredeempresa.tipos_de_datos_y_funciones;

public class Funciones {

//-----------------------------------------------------------------------------------------------------
// Metodo Main
//-----------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        // Opcion 1: Funcion sin parametros y sin tipo de retorno
        showMenu();
        showMenu();

        // Opcion 2: funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(getMenu());
        System.out.println(menu);

        double price = getPrice();
        System.out.println(price);

        // opcion 3: funcion con parametros sin retorno
        imprimirSaludoBuenosDias(" OpenBootcamp");

        // opcion 4: funcion con parametros y retorno
      String saludo = obtenerSaludo("Marco", "Fou");
        System.out.println(saludo);
    }
//------------------------------------------------------------------------------------------------------------
    // Declaracion de funciones
//------------------------------------------------------------------------------------------------------------
    static void showMenu() {
        System.out.println("Bienvenidos al E-Commerce de zapatillas: ");
        System.out.println("1- Ver zapatillas ");
        System.out.println("2- Comprar zapatilla ");
        System.out.println("3- Salir ");
    }
    static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas: \n 1- ver zapatillas:........";
    }

    static void imprimirSaludoBuenosDias(String nombre){
        System.out.println("buenas tardes" + nombre);
    }
    static double getPrice(){
        return 100.99;
    }

    static String obtenerSaludo(String nombre, String apellido){
       return "Buenas tardes " + nombre + " " + apellido;
    }

}

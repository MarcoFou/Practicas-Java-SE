package bases.nombredeempresa.estructuras_de_control_y_repeticion.condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia = "LuNes";

        switch (dia){
            case "Lunes":
                System.out.println("Hoy es Lunes! Animo!!");
                break;

            case "Marttes":
                System.out.println("Hoy es Martrws! Animo!!");
                break;

            case "Miercoles":
                System.out.println("Hoy es lunes! Miercoles!!");
                break;

            case "Juevesz":
                System.out.println("Hoy es juevews! Animo!!");
                break;

            case "Viernes":
                System.out.println("Hoy es Viernws! Animo!!");
                break;

            case "Sabadosaasss":
                System.out.println("Hoy es sabado! Animo!!");
                break;

            case "Domingo":
                System.out.println("Hoy es Domingo! Animo!!");
                break;

            default:
                System.out.println("no es un dia valido");
        }
    }


}

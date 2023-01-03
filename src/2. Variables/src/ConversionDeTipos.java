public class ConversionDeTipos {

    public static void main(String[] args) {
        
        
        // Convertir String a int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        
        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(realStr);
        
        // Convertir de Primitivos a cadenas
        
        int otroNumeroInt = 100;
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        
        //Sobrecarga de metodos
        otroNumeroStr = String.valueOf(otroNumeroInt+12); //Si sumo strings o char los concatena
        
       
    
    }
    
}

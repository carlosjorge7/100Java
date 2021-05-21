/**
56.- Crea una clase llamada MiString, sin atributos y con los siguientes métodos públicos y estáticos:

* String alReves(String): Devuelve la cadena pasada como parámetro pero al revés.

* String limpiaCaracteres(String, String): Devuelve la cadena pasada como primer parámetro pero
eliminando los caracteres pasados en la cadena como segundo parámetro.

* String susituye(String, char, char): Devuelve la cadena pasada como parámetro pero
sustituyendo todas las apariciones del primer char que pudiera haber por el segundo.

* boolean todosIguales(String): Devuelve true o false, dependiendo de si todos los caracteres de la
cadena son iguales o no.

* String quitaEspacios(String): Devuelve una cadena con los espacios en blanco que pudiera tener
eliminados.

* boolean esNumeroEntero(String): Devuelve true o false, dependiendo de si todos los caracteres
pasados como parámetro son numéricos.
 **/
package pkg56_mi_string;


public class MiString {
    
    public MiString(){
        
    }
    
    public static String alReves(String cadena){
        
        StringBuilder alReves = new StringBuilder();
        
        for (int i = cadena.length() -1; i >= 0; i--) {
            
            alReves.append(cadena.charAt(i));
        }
        return alReves.toString();
    }
   
    public static String limpiaCaracteres(String cad1, String cad2){
        
        StringBuilder aux = new StringBuilder();
        
        for (int i = 0; i < cad1.length(); i++) {
            
            if(seEncuentra(cad1.charAt(i), cad2) == false){
                
                aux.append(cad1.charAt(i));
            }
           
        }
        return aux.toString();
    }
    
    //Metodo de ayuda
    private static boolean seEncuentra(char c, String cadena){
        
        for (int i = 0; i < cadena.length(); i++) {
            
            if(c == cadena.charAt(i)){
                
                return true;
            }
        }
        return false;
    }
               
    public static String sustituye(String cadena, char x, char y){
        
       StringBuilder sust = new StringBuilder();
        
        for (int i = 0; i < cadena.length(); i++) {
            
            if(x == cadena.charAt(i)){
                
                sust.append(y);
            }
            else{
                sust.append(cadena.charAt(i));
            }
           
        }
        return sust.toString();
        
    }
    
    public static boolean todosIguales(String cad){
        
        for (int i = 1; i < cad.length(); i++) {
            
            if(cad.charAt(0) == cad.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
    public static String quitaEspacios(String cad){
        
        return cad.replace(" ", "");
    }
    
    public static boolean esNumeroEntero(String cad){
        
        for (int i = 0; i < cad.length(); i++) {
            
            if(cad.charAt(i) < '0' || cad.charAt(i) > '9'){
                
                return false;
            }
        }
        return true;
    }           
}

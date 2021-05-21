/*
45.- Realiza un programa que lea cadenas hasta que se introduzca “fin”.
Nos mostrará la
cadena con mayor longitud, sin contar la cadena “fin”. 
En caso de empate se mostrará la última
introducida de las que tienen esa mayor longitud.
 */
package pkg45_cad_fin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        String cadenaMayor = "";
        
        do{
            System.out.println("Cadena:");
            cadena = sc.nextLine();
            
            if(cadena.length() > cadenaMayor.length()){
                cadenaMayor = cadena;
            }
            
            
        }
        while(!cadena.equals("fin"));
        System.out.println("Cadena mayor= " + cadenaMayor);
        
    }
    
}

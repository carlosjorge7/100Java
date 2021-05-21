/*
49- Realiza un programa que lea una cadena y nos diga si está en mayúsculas o no.
 */
package pkg49_mayus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena");
        String cad = sc.nextLine();
        
        if(cad == cad.toUpperCase()){
            
            System.out.println(cad + "esta en mayusculas");
        }
        else{
            System.out.println(cad + "no esta en mayusculas");
        }
    }
    
}

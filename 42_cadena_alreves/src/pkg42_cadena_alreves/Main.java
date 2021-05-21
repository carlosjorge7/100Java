/*
42 .- Realiza un programa que lea una frase y nos la muestre al revés.
 */
package pkg42_cadena_alreves;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena:");
        String cadena = sc.nextLine();
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
    
}

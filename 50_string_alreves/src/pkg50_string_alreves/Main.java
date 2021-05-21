/*
50.- Realiza un programa que lea una frase y muestre las palabras en el orden inverso.
Ejemplo:
Cadena: Me gusta programar.
Resultado: programar. Gusta Me
 */
package pkg50_string_alreves;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cadena:");
        String cad = sc.nextLine();
        
        String[] palabras = cad.split(" ");
        
        for (int i = palabras.length - 1; i >= 0; i--) {
            
            System.out.print(palabras[i] + " ");
        }
        
    }
    
}

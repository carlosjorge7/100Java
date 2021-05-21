/*
51.- Realiza un programa que lea una cadena y elimine las letras ‘a’ 
que pudiera contener.
Finalmente se mostrará la cadena.
Ejemplo:
Cadena: Hace buen día.
Resultado: Hce buen dí.
 */
package pkg51_eliminar_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena");
        String cad = sc.nextLine();
        //Replace es un metodo tipo String        
        cad = cad.replace('a', ' ');
        System.out.println("La cadena sin la vocal 'a' = " + cad);
        
    }
    
}

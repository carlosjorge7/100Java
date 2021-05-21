/*
 4.- Programa que muestra todos los divisores de un número introducido.
Entre los divisores no se incluirá el
propio número.
 */

package pkg4_ejercicio;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numero:");
        int num = sc.nextInt();
        
        for (int d = 1; d <= num  ; d++){ 
            
            if(num % d == 0){
                System.out.println("Divisores:" + d + " " );   
            }
        }  
    }
}
    

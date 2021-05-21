/*
14.- Programa que lee un número 
y muestra la suma de sus divisores, sin incluir el propio número.
 */
package pkg14_suma_div;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumDiv = 0;
        
        System.out.println("Numero:");
        int num = sc.nextInt();
        
        for (int d = 1; d < num; d++) {
            
            if(num % d == 0){
                sumDiv += d;
            }
            
        }
        
        System.out.println("La suma de los divisores de " + num + "SUMA=" + sumDiv);
            
    }
    
}

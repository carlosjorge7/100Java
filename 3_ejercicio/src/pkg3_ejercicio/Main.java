/*
 3.- Programa que lee de manera 
consecutiva números hasta que se introducen dos números iguales seguidos.
 */
package pkg3_ejercicio;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numero:");
        int num1 = sc.nextInt();
        System.out.println("Numero:");
        int num2 = sc.nextInt();
        
        while(num1 != num2){
            
            System.out.println("Numero:");
            num1 = num2;
            num2 = sc.nextInt();
        }
        System.out.println("Has introducido dos numeros iguales consecutivos");
    }
    
}

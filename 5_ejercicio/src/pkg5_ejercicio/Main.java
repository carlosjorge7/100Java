/*
5.- Programa que nos informa si un número introducido es primo o no.
NOTA: Un número es primo si tiene dos
únicos divisores que son el 1 y él mismo.
 */
package pkg5_ejercicio;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero:");
        int num = sc.nextInt();
        int contDiv = 0;
        
        
        if(num != 0){
            
            for (int d = 1; d <= num; d++) {
            
                if(num % d == 0){
                    contDiv++;
                }
            
            }
        
            if(contDiv == 2 || contDiv == 1){
                System.out.print(num + "es primo");
            }
            else{
                System.out.print(num + "no es primo");
            }
              
        }
        else{
            System.out.print("Error 0 ");
        }
        
    }
    
}

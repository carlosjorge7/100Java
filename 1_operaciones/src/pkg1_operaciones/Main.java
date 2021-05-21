/*
1.- Programa que lee dos números desde consola y nos muestra su suma y
el resultado de la división del primero
entre el segundo.
 */
package pkg1_operaciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numero 1:");
        float n1 = sc.nextInt();
        
        System.out.println("Numero 1:");
        float n2 = sc.nextInt();
        
        if(n2 == 0){
            System.out.print("Error, division por cero");
        }
        else{
            System.out.println("Suma:" + (n1+n2));
            System.out.println("Division" + (n1 / n2));
            
        }
       
    }
    
}

/*
23.- Realiza un programa que lea 13 números y muestre al final los repetidos. 
Cada número repetido será mostrado una sola vez.
 */
package pkg23_mostrar_repetidos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        final int NUM = 13;
        int[] arr = new int[NUM];
        boolean repetido;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Numero:");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            
            repetido = false;
            
            for (int k = arr.length - 1; k >=0; k--) {
                
                if(arr[i] == arr[k] && i != k){
                    
                    repetido = true;
                }
            }
            
            if(repetido){
                System.out.println(arr[i]);  
            }
        }
    }
}

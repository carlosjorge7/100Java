/*
35.- Realiza un programa que lea 8 números y los muestre de manera descendente.
Es decir, de mayor a menor
 */
package pkg35_descendente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //<>
        Scanner sc = new Scanner(System.in);
        final int NUM = 8;
        int[] arr = new int[NUM];
        int aux;
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("Numero:");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int k = 0; k < arr.length - 1; k++) {
                
                if(arr[k] < arr[k+1]){
                    
                    aux = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = aux;
                }
            }  
        }
        
        System.out.println("Numeros ordenados descendentemente:");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
            
        }
    }
    
}

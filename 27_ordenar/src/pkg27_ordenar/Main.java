/*
27.- Realiza un programa que lea 23 números para posteriormente
mostrarlos en orden ascendente. De menor a mayor  i < i+1
 */
package pkg27_ordenar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 10;
        int[] arr = new int[NUM];
        int aux;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Numero:");
            arr[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length - 1; j++) {
                
                if(arr[j] > arr[j+1]){
                    
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
                
            }
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    
}

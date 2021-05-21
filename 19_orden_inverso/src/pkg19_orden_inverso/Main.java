/*
19.- Realiza un programa que lea desde teclado 11 números enteros,
para posteriormente mostrarlos en el orden
inverso al que fueron introducidos.
 */
package pkg19_orden_inverso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 11;
        int[] arr = new int[NUM];
        
        System.out.println("Carga de datos:");
        for (int i = 0; i < arr.length; i++){
            
            System.out.println("Numero:");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Salida de datos:");
        for (int i = arr.length - 1; i >= 0; i--){
            
            System.out.println(arr[i] + " ");
            
        }
        
        
    }
    
}

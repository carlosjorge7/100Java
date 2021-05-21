/*
24.- Realiza un programa que lea 20 números decimales 
y al final muestre la media de todos ellos y los que son
superiores a dicha media.
 */
package pkg24_media;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 20;
        float[] arr = new float[NUM];
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println("Numero:");
            arr[i] = sc.nextFloat();
            sum += arr[i];
        }
        
        System.out.println("Superiores a la media = " + sum/NUM );
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] > sum/NUM){
                System.out.println(arr[i]);
            }
            
        }
        
        
    }
    
}

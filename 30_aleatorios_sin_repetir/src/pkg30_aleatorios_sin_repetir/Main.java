/*
30.- Realiza un programa que muestre 10 números
aleatorios enteros y sin repetir de entre el 1 y el 100, ambos inclusive.
 */
package pkg30_aleatorios_sin_repetir;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       
        Random rd = new Random();
        final int NUM = 10;
        int [] arr = new int[NUM];
        int cont = 0;
        boolean repetido;
        
        while(cont < NUM){
            
            int aux = rd.nextInt(100) + 1;
            repetido = false;
            
            for (int i = 0; i < cont && !repetido; i++) {
                
                if(arr[i] == aux){
                    repetido = true;
                } 
            }
            
            if(!repetido){
                arr[cont] = aux;
                cont++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}

/*
36.- Realiza un programa que termine cuando el usuario haya metido todos 
los números comprendidos entre el 1
y el 10.
 */
package pkg36_del_1_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        final int NUM = 10;
        int[] arr = new int[NUM];
        int cont = 0;
        boolean repetido;
        
        while(cont < NUM){
            
            System.out.println("Numero");
            int aux = sc.nextInt();
            repetido = false;
            
            if(aux >= 1 && aux <= 10){
                
                for (int i = 0; i < cont && !repetido; i++) {
                    
                    if(aux == arr[i]){
                        repetido = true;
                    }
                }
                
                if(!repetido){
                    arr[cont] = aux;
                    cont++;
                }
                else{
                    System.out.println("Numero repetido");
                }
                
            }
            else{
                System.out.println("Numero fuera de rango");
            }
        }
        System.out.println("Has introducido los numeros del 1 al 10");
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */
        
    }
    
}

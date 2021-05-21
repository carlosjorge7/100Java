/*
 21.- Realiza un programa que lea números enteros desde teclado hasta que se
introduzcan 9, o bien hasta que se
introduzca un número repetido. 
Al acabar el programa mostrará los números introducidos, sin incluir el número repetido
en caso de existir.
 */
package pkg21_sin_repetido;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 9;
        int[] arr = new int[NUM];
        boolean repetido = false;
        int cont = 0;
        
        //La premisa de la que parto es que si encuentra uno repetido, acaba el programa
        while(cont < NUM && !repetido){
            
            System.out.println("Numero");
            int aux = sc.nextInt();
            
            for (int i = 0; i < cont && !repetido; i++) {
                
                if(arr[i] == aux){
                    repetido = true;
                }
            }
            
            if(!repetido){ /* if(repetido == false)*/
                arr[cont] = aux;
                cont++;
            }
            else{
                System.out.print("Repetido");
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
            
        }
    }
}


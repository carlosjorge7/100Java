/*
22.- Realiza un programa que lea 10 números desde consola. 
Una vez introducidos se motrarán lo números no
repetidos.
 */
/*La premisa de la que partimos es, cargamos el array con los 10 valores y
luego de esos elementos mostramos los no repetidos*/
package pkg22_mostrar_sin_repetir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       final int NUM = 10;
       int[] arr = new int[NUM];
       boolean repetido;
       
       for (int i = 0; i < arr.length; i++) {
           System.out.println("Numero:");
           arr[i] = sc.nextInt();
       }
       
       for (int i = 0; i < arr.length; i++){
           
           repetido = false;
           
           for (int k = arr.length - 1; k >=0; k--) {
               
               if(arr[i] == arr[k] && i != k){
                    repetido = true;
               }
           }
           
           if(!repetido){
               System.out.println(arr[i]);
           }
            
       }
       
    }
    
}

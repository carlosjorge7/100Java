/*
20.- Realiza un programa que lea desde teclado 7 números distintos. 
Si se introdujera un número repetido se mostrará
el mensaje “Repetido” y no será tenido en cuenta.
Al acabar el programa mostrará los 7 números introducidos..
 */
package pkg20_repetidos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        final int NUM = 7;
        int[] nums = new int[NUM];
        boolean repetido;
        int cont = 0;
        
        while(cont < NUM){
            
            System.out.println("Numero:");
            int aux = sc.nextInt();
            repetido = false;
            
            for (int i = 0; i < cont && !repetido; i++){
                
                if(aux == nums[i]){
                    
                    repetido = true;   
                }    
            }
            
            if(!repetido){  /* if(repetido == false)*/
                nums[cont] = aux;
                cont++;
            }
            else{
                System.out.print("Repetido");
            }
            
        }
        
        System.out.println("Output");
        for (int i = 0; i < nums.length; i++){
            
            System.out.print(nums[i] + " ");
        }
        
    }
    
}

/*
2.- Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive.En el 
caso en el que algún
número introducido no se encontrara dentro del rango permitido, se mostrará un mensaje
de error y seguirá
pidiendo números. El programa finalizará cuando se hayan introducido 11 números 
válidos y mostrará el número
máximo introducido de los 11 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
 */
package pkg2_ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int contValidos = 0;
        int contNoValidos = 0;
        int max = 0;
        
        while(contValidos < 11){
            
            System.out.println("Numero:");
            int num = sc.nextInt();
               
            if(num <= 40 && num >= 20){
               
                contValidos++;
                
                if(num > max){
                    max = num;
                }
            }
            
            else{
                System.out.println("Numero out of range");
                contNoValidos++;
            }
             
        }
        System.out.println("MAXIMO=" + max + "CANTIDAD DE VALIDOS="+
                contValidos + "CANTIDAD DE NO VALIDOS="+ contNoValidos);
            
      
    }
    
}

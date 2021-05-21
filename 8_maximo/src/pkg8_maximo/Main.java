/*
8.- Programa que lee 10 números. 
Al finalizar mostrará el máximo introducido, y cuántas veces se repite dicho
máximo.
 */
package pkg8_maximo;

import java.util.Scanner;

public class Main{
    
    public static void main (String [] args){
            
	Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int cont = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Numero:");
            int num = sc.nextInt();
            
            if(num > max){
                max = num;
                cont = 1; //Porque el primer numero que metamos es el maximo si o si
            }
            else if(num == max){
                cont++;
            }
        }
        System.out.println("Maximo=" + max + "Veces"+ cont);
    }

}

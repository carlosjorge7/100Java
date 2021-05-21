/*
13.- Programa que lee una secuencia de 10 números y muestra el mayor
de los múltiplos de 5, y el menor de los
múltiplos de 3. Si no hubiera ningún múltiplo, el programa lo indicaría.
 */
package pkg12_multiplos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int mayorMult5 = Integer.MIN_VALUE;
        int menorMult3 = Integer.MAX_VALUE;
        
        for (int i = 0; i < 10; i++){
            
            System.out.println("Numero:");
            int num = sc.nextInt();
            
            if(num % 5 == 0 && num > mayorMult5){
                mayorMult5 = num;   
            }
            if(num % 3 == 0 && num < menorMult3){
                menorMult3 = num;  
            }  
        }
        
        if(mayorMult5 == Integer.MIN_VALUE){
            System.out.println("No existe maximo multiplo de 5");
        }
        else{
            System.out.println("Maximo multiplo de 5 = "+ mayorMult5);
        }
        if(menorMult3 == Integer.MAX_VALUE){
            System.out.println("No existe minimo multiplo de 3");
        }
        else{
            System.out.println("Minimo multiplo de 3 = " + menorMult3);
        }
        
    }
    
}

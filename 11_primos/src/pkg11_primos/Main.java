/*
11.- Programa que muestra los números primos existentes entre el 1 y el 100.
 */
package pkg11_primos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        final int NUM = 100;
        Scanner sc = new Scanner(System.in);
        long tiempoInicio = System.currentTimeMillis();
        
        for (int primo = 1; primo <= NUM; primo++){
            
            int contDiv = 0;
            
            for (int d = 1; d <= primo; d++){
                
                if(primo % d == 0){
                    contDiv++;
                }
            }
            if(contDiv == 2 || contDiv == 1){
                System.out.println(primo + " , ");
            }        
        }
        
        long tiempoFin = System.currentTimeMillis();
        
        System.out.println("Tiempo de ejecucion:" + (tiempoFin - tiempoInicio));
    } 
}

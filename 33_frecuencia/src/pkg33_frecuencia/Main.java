/*
33.- Realiza un programa que lea desde teclado 20 puntuaciones numéricas enteras
que han de estar
comprendidas entre el 0 y el 5, ambos inclusive. 
Al finalizar se mostrará por cada una de las puntuaciones, su
frecuencia.
Frecuencias:
0: 23 veces.
1: 34 veces.
2: 0 veces.
3: 78 veces.
4: 54 veces.
5: 11 veces.
 */
package pkg33_frecuencia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 10;
        int[] puntuaciones = new int[NUM];
        int cont = 0;
        
        while(cont < NUM){
            
            System.out.println("Puntuacion(0...5)");
            int punt = sc.nextInt();
            
            if(punt >= 0 && punt <= 5){
                
                puntuaciones[cont] = punt;
                cont++;
            }
            else{
                System.out.println("Puntuacion fuera de rango (0...5)");
            }
            
        }
        System.out.println("Frecuencias");
        for (int i = 0; i < puntuaciones.length; i++) {
            
            System.out.println(i + ": " + puntuaciones[i] +
					" veces.");
        }
        
        
        
        
        
        
    }
    
}

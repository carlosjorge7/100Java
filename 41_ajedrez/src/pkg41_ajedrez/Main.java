/*
41.- Realiza un programa que lea desde consola un array de dimensiones introducidas
por el usuario y el valor
inicial, que deberá ser 0 ó 1. Se creará y mostrará el array formando 
un dibujo en “ajedrez” con 0 y 1. Ejemplo de
3 x 4 y valor inicial 0:
 */
package pkg41_ajedrez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("FILAS:");
        int filas = sc.nextInt();
        System.out.println("COLUMNAS");
        int columnas = sc.nextInt();
        
        int[][] mat = new int[filas][columnas];
        
        System.out.println("Valor inicial(0 o 1):");
        int valor = sc.nextInt();
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[0].length; j++) {
                
                
                
            }
            
        }
    }
    
}

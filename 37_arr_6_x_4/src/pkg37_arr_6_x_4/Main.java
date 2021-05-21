/*
 37.- Realiza un programa que cargue y muestre un array de 6 x 4 con números enteros 
aleatorios de entre el 1 y
el 10, ambos inclusive. Además se ha de mostrar el número de fila cuya 
suma de sus elementos es la mayor. En
caso de empate se mostrará la primera fila.
 */
package pkg37_arr_6_x_4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Random rd = new Random();
        final int FIL = 6;
        final int COL = 4;
        int[][] matriz = new int[FIL][COL];
        int[] sumasFilas = new int[FIL];
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                
                matriz[i][j] = rd.nextInt(10) + 1;
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
       
        //Para sumar los elementos de la fila i, sumo los elementos de cada j 
        for (int j = 0; j < matriz[0].length; j++) {
            
            for (int i = 0; i < sumasFilas.length; i++) {
                
                sumasFilas[i] += matriz[i][j];
            }
            
        }
        
        for (int i = 0; i < sumasFilas.length; i++) {
            
            System.out.println("La suma de la fila " + i + "es" + sumasFilas[i]);
        }
        
        int iMayor = 0;
        int sumaMayor = 0;
        
        for (int i = 0; i < sumasFilas.length; i++) {
            
            if(sumasFilas[i] > sumaMayor){
                
                sumaMayor = sumasFilas[i];
                iMayor = i;
            }
        }
        
        System.out.println("La fila que mas suma es la numero" + iMayor);
        
        
    }
    
}

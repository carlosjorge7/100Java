/*
38.- Realiza un programa que cargue y muestre un array de enteros de 4 x 4 desde consola.
Finalmente el
programa dirá si existe algún número repetido o no (sin especificar cuál o cuáles).
 */
package pkg38_mat_rep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int FIL = 4;
        final int COL = 4;
        int[][] matrix = new int[FIL][COL];
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                
                System.out.println("Coordenada:");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        boolean repetido = false;
        
        //Algoritmo para saber si hay repetidos
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int i1 = i + 1; i1 < matrix.length; i1++) {
                
                for (int j = 0; j < matrix[0].length; j++)  {
                    
                    for (int j1 = j + 1; j1 < matrix[0].length; j1++) {
                        
                        if(matrix[i][j] == matrix[i1][j1]){
                            
                            repetido = true;
                        }
                        
                    }
                    
                }
            }
            
        }
        
        if(repetido){
            System.out.println("Existe algun elemento repetido");
        }
        else{
            System.out.print("No existe ningun elemento repetido");
        }
    }
    
}

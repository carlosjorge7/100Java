/*
40.- Realiza un programa que lea 
y muestre desde consola un array de 3 x 3 y nos diga si todas sus filas suman
lo mismo.
 */
package pkg40_arr_3x3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int FIL = 3;
        final int COL = 3;
        int[][] mat = new int[FIL][COL];
        
        int[] sumaFilas = new int[FIL];
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[0].length; j++) {
                
                System.out.println("Coordenada");
                mat[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[0].length; j++) {
                
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        
        for (int j = 0; j < mat[0].length; j++) {
            
            for (int k = 0; k < sumaFilas.length; k++) {
                
                sumaFilas[k] += mat[k][j];
            }
        }
        
        boolean filasSumanIgual = true;
        
        for (int i = 1; i < sumaFilas.length; i++) {
            
            if(sumaFilas[0] != sumaFilas[i]){
                
                filasSumanIgual = false;
            }
        }
        
        if(!filasSumanIgual){
            System.out.print("No todas las filas suman igual");
        }
        else{
            System.out.print("Todas las filas suman igual");
        }
    }
    
}

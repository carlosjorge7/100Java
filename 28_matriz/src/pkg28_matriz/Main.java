/*
28.- Realiza un programa que cargue desde teclado una tabla bidimensional de 3x2
de números enteros.
Posteriormente el programa mostrará la tabla introducida en formato de filas
y columnas y pedirá un número a buscar.
En caso de encontrarlo indicará el número de fila y columna donde se ha encontrado 
por primera vez. El programa
ofrecerá al usuario la opción de seguir buscando más números 
“¿Desea seguir buscando números?(s/n)”.

*/

package pkg28_matriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int FIL = 3;
        final int COL = 2;
        int[][] matriz = new int[FIL][COL];
        String resp;
        
        for (int f = 0; f < matriz.length; f++) {
            
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("Coordenada:");
                matriz[f][c] =  Integer.parseInt(sc.nextLine());
            }
        }
        
        do{
            for (int f = 0; f < matriz.length; f++) {
            
                for (int c = 0; c < matriz[0].length; c++) {
                    System.out.print(matriz[f][c] + " ");
                }
                System.out.println();
            }
            
            int filEncontrada = 0;
            int colEncontrada = 0;
            
            System.out.println("Numero a buscar:");
            int buscar =  Integer.parseInt(sc.nextLine());
            boolean encontrado = false;
            
            for (int f = 0; f < matriz.length && !encontrado; f++) {
            
                for (int c = 0; c < matriz[0].length && !encontrado; c++) {
                    
                    if(buscar == matriz[f][c]){
                        encontrado = true;
                        filEncontrada = f; //Le paso la fila f a la filEncontrada, es como asignar un maximo
                        colEncontrada = c;
                    }
                }
            }
            
            if(encontrado){
                System.out.println("El numero" + buscar +
                "se ha encontrado en la fila" + filEncontrada +
                        "y en la columna" + colEncontrada);
            }
            else{
                System.out.println("El numero" + buscar + "no ha sido encontrado");
            }
            
            System.out.println("Desea seguir buscando numeros en la matriz?(s/n)");
            resp = sc.nextLine();
            
        }
        while(resp.equals("s"));
        
    }
    
}

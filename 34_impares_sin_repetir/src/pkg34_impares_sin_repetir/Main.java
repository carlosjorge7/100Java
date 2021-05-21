/*
34.- Realiza un programa que lea números 
enteros desde teclado hasta que se introduzcan 12 impares sin repetir.
 */
package pkg34_impares_sin_repetir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 12; 
        int[] impares = new int[NUM];
        boolean repetido;
        int cont = 0;
        
        while(cont < NUM){
            
            System.out.println("Numero:");
            int aux = sc.nextInt();
            repetido = false;
            
            if(aux % 2 != 0){
                
                for (int i = 0; i < cont && !repetido; i++) {
                    
                    if(aux == impares[i]){
                        repetido = true;
                    }
                }
                
                if(!repetido){
                    impares[cont] = aux;
                    cont++;
                }
                else{
                    System.out.println("El impar esta repetido");
                }
            }
            
            else{
                System.out.println("No se admiten pares");
            }
        }
        
        System.out.println("Lom impares sin repetir son:");
        for (int i = 0; i < impares.length; i++) {
            
            System.out.println(impares[i]);
        }
        
    }
    
}

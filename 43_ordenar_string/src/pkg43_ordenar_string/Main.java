/*
43.- Realiza un programa que lea 10 palabras, para posteriormente mostrarlas en orden
alfabético ascendente.
 */
package pkg43_ordenar_string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[10];
        String aux;
        
        for (int i = 0; i < palabras.length; i++) {
            
            System.out.println("Palabra:");
            palabras[i] = sc.nextLine();
        }
        
        for (int i = 0; i < palabras.length; i++) {
            
            for (int j = 0; j < palabras.length - 1; j++) {
                
                if(palabras[j].compareToIgnoreCase(palabras[j+1]) > 0){
                
                    aux = palabras[j];
                    palabras[j] = palabras[j+1];
                    palabras[j+1] = aux;
                }
                
            }
        }
        
        System.out.println("Ordenado(A..Z)");
        for (int i = 0; i < 10; i++) {
            System.out.println(palabras[i]);
        }
        
        
    }
    
}

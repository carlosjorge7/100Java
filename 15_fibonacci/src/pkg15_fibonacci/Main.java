/*
15.- Programa que genera los N primeros números de la serie de Fibonacci.
El valor N deberá ser leído por el
teclado. NOTA: Los dos primeros números son 1, 
y el resto se obtiene sumando los dos anteriores:
1,1,2,3,5,8,13,21,34...
 */
package pkg15_fibonacci;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      System.out.print("Longitud de la serie de Fibonacci:");
      int n = sc.nextInt();
      int numFib; 
      int penultimo = 1;
      int ultimo = 1;
      System.out.print("1,1,");

      for (int i = 0; i < n; i++){
          
        numFib = penultimo + ultimo; 	
        System.out.print(numFib + ",");
        ultimo = penultimo;
        penultimo = numFib;
      }
    }
}

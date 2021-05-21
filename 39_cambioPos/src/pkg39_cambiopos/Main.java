/**
 39.- Realiza un programa que lea un array de enteros de tamaño 10. 
Se deberá invertir la ubicación de los
elementos y posteriormente mostrarlo:
 **/
package pkg39_cambiopos;

import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        //Lectura
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print("Numero");
            numeros[i] = sc.nextInt();
        }
        
       
        //Cambio de ubicacion
        int aux;
        // numeros.length/2 , ya que solo tenemos que cambiar la mitad del array de pos, 
        //Si pusieramos numeros.length cambiaria hasta la mitad, y luego volveria a cambiar la otra mitad, en esencia no hariamos nada
        for (int i = 0; i < numeros.length/2; i++){
			// nums[i] --- nums[nums.length - 1 - i]
                aux = numeros[i];
		numeros[i] = numeros[numeros.length - 1 - i];
		numeros[numeros.length - 1 - i] = aux;
        }
        
        //Salida
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
    }
    
}

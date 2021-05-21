/*
6.- Programa que lee 9 números, y en el caso en el que el primero introducido
sea igual al último, nos muestra la
media. En caso contrario, no se mostrará nada.
 */
package pkg6_ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
       final int NUM = 9;
       Scanner sc = new Scanner(System.in);
       int num = 0;
       System.out.println("Numero:");
       int primero = sc.nextInt();
       int sum = primero;
  
       for (int i = 0; i < NUM - 1; i++) {
           
           System.out.println("Numero:");
           num = sc.nextInt();
           sum += num;   
       }
       // primero == num (este num serra el ultimo introducido)
       if(primero == num){
           
           System.out.println("MEDIA="+ sum/9f);
       }
       else{
           System.out.print("Fin del programa");
       }
       sc.close();
       
    }
    
}

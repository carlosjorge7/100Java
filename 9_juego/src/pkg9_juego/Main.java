/*
9.- Programa consistente en un juego en el que el Jugador1 introduce un número 
entre el 1 y el 100 y el Jugador2
tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento del Jugador2 
se mostrará el mensaje “Te
pasaste”, o “No llegaste”, según corresponda. El programa terminará cuando se agoten
los intentos y/o el
Jugador2 acierte el número. Se ha de mostrar el mensaje correspondiente.
 */
package pkg9_juego;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); //<>
        
        int intentos = 0;
        System.out.println("Numero a adivinar(Jugador 1):");
        int adivinar = sc.nextInt();
        
        if(adivinar <= 100 && adivinar >= 1){
            
            while(intentos < 10){
                
                System.out.println("Numero a introducir(Jugador 2)");
                int num = sc.nextInt();
                
                if(num > adivinar){
                    System.out.println("Te pasaste");
                    intentos++;
                }
                else if(num < adivinar){
                    System.out.println("No llegaste");
                    intentos++;
                }
                else{
                    System.out.println("Ganaste");
                }
                System.out.println("Lo siento, has agotado todos tus intentos");
                
            } 
        }
        else{
            System.out.println("Number out of range");
        }
        
    }
    
}

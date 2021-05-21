/*10.- Programa que lee 10 números e indica si todos los números son iguales o no.*/

package pkg10_todos_re;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean iguales = true;
        
        System.out.println("Numero:");
        int primero = sc.nextInt();
        
        for (int i = 0; i < 9; i++) {
            
            System.out.println("Numero:");
            int num = sc.nextInt();
            
            if(num != primero){
                iguales = false;
            }
            
        }
        
        if(!iguales){
            System.out.println("Son distitos");
        }
        else{
           System.out.println("Son iguales"); 
        }
        
                  
    }
    
}

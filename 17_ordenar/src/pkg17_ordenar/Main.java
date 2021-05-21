/*
17.- Programa que lee 3 números y los muestra ordenados de manera descendente.

Input : 3, 2, 10
Output: 10, 3, 2
 */
package pkg17_ordenar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c;
		
        System.out.print("Introduce tres números : "); 		
        System.out.print("Primer número : ");
        a = sc.nextInt();
        System.out.print("Segundo número : ");
        b = sc.nextInt();
        System.out.print("Tercer número : ");
        c = sc.nextInt();
        if(a>=b && b>=c){
            System.out.print("El orden de los números es : " + a + b + c );
	}
        else if(a>=c && c>=b){
            System.out.print("El orden de los números es : " + a + c + b );
        }
        else if(b>=a && a>=c){
            System.out.print("El orden de los números es : " + b + a + c );
	}
        else if(b>=c && c>=a){
            System.out.print("El orden de los números es : " + b + c + a );		
	}
        else if(c>=a && a>=b){
            System.out.print("El orden de los números es : " + c + a + b );		
	}
	else{
            System.out.print("El orden de los números es : " + c + b + a );		
	}
         
    }
    
}

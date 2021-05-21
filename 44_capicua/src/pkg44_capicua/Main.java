/*
44.- Realiza un programa que lea un número entero y nos diga si es par o impar
y si es capicúa
o no.
 */
package pkg44_capicua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero:");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num + "es par");
        }
        else{
            System.out.println(num + "es impar");
        }
        
        String cadena = num + "";
        boolean capicua = true;
        
        for (int i = 0, j = cadena.length() - 1; i < cadena.length() && j >= 0; i++, j--) {
            
            if(cadena.charAt(i) != cadena.charAt(j)){
                capicua = false;
            }
        }
        
        if(capicua){
            System.out.println(cadena + "es capicua");
        }
        else{
            System.out.println(cadena + "no es capicua");
        }
        
    }
    
}

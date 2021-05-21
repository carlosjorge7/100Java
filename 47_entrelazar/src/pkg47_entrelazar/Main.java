/*
47.- Realiza un programa que lea dos cadenas de caracteres. Se mostrarán entrelazadas,
empezando por la primera.
Ejemplo:
Cadena 1: abcdefg
Cadena 2: 1234
Resultado: a1b2c3d4efg
 */
package pkg47_entrelazar;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cadena 1");
        String cad1 = sc.nextLine();
        
        System.out.println("Cadena 2");
        String cad2 = sc.nextLine();
        
        String res = "";
        
        int min = 0; //<>
        
        if(cad1.length() > cad2.length()){
            
            min = cad2.length();
        }
        
        else{
            
            min = cad1.length();
        }
        
        for (int i = 0; i < min; i++) {
            
            res += cad1.charAt(i) + "" + cad2.charAt(i);
        }
         
        if(cad1.length() > cad2.length()){
            
           res += cad1.substring(cad1.length() - cad2.length(), cad1.length());
       
        }
        else{
            
            res += cad2.substring(cad2.length() - cad1.length(), cad2.length());
        }
        
        System.out.println(res);
        
    }
    
}

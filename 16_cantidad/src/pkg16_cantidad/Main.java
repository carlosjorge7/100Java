/*
16.- Programa que lee cantidades y precios de productos,
para al final indicar el total de la factura. Si el importe
supera los 1000€ se aplicará un descuento del 5%.
El programa finaliza al introducir una cantidad 0.
 */
package pkg16_cantidad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        float total = 0;
        
        System.out.println("Cantidad de productos:");
        int stock = sc.nextInt();
        
        
        while(stock != 0){
            
            System.out.println("Precio de producto");
            float precio = sc.nextFloat();
            System.out.println("Cantidad de productos:");
            stock = sc.nextInt();
            total = total + precio * stock;
        }
          
        if(total > 1000){
            
            total = total * 0.95f; 
            System.out.println("TOTAL CON DCTO DEL 5% =" + total);
        }
        
        System.out.println("TOTAL=" + total);
        
    }
    
}

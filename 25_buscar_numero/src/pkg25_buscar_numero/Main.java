/*
25.- Realiza un programa que lea desde teclado 9 números.
A continuación nos pedirá que busquemos un número entre
los introducidos, y nos dirá si ha sido encontrado o no. 
El programa nos preguntará si queremos seguir buscando más
números o no: “¿Desea seguir buscando números?(s/n)”.
 */
package pkg25_buscar_numero;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 9;
        int[] arr = new int[NUM];
        String resp;
        boolean encontrado;
        
        //Ponemos Integer.parseInt ya que mezcla String con int
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Numero:");
            arr[i] = Integer.parseInt(sc.nextLine());
            //arr[i] = sc.nextInt();
        }
        
        do{
            System.out.println("Numero a buscar:");
            int buscar = Integer.parseInt(sc.nextLine());
            //int buscar = sc.nextInt();
            
            encontrado = false;
            
            for (int i = 0; i < arr.length; i++) {
                
                if(buscar == arr[i]){
                    encontrado = true;
                }
                
            }
            if(encontrado){
                System.out.println("Encontrado");
            }
            else{
                System.out.println("No encontrado");
            }
            System.out.println("Desea seguir buscando(s/n):");
            resp = sc.nextLine();
            
        }
        while(resp.equals("s"));
        
    }
    
}

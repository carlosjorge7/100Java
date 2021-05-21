/*
26.- Realiza un programa que lea desde teclado 7 números.
A continuación nos pedirá que busquemos un número entre
los introducidos, y nos dirá si ha sido encontrado o no.
En el caso en el que haya sido encontrado, nos indicará cuántas
veces se ha introducido. El programa nos preguntará si queremos seguir
buscando más números o no: “¿Desea
seguir buscando números?(s/n)”.
 */
package pkg26_buscar_numero_veces;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 7;
        int[] arr = new int[NUM];
        String resp;
        int cont = 0;
        boolean encontrado;
        
        //Ponemos Integer.parseInt ya que mezcla String con int
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Numero:");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        
        do{
            System.out.println("Numero a buscar:");
            int buscar = Integer.parseInt(sc.nextLine());
            
            encontrado = false;
            
            for (int i = 0; i < arr.length; i++) {
                
                if(buscar == arr[i]){
                    cont++; 
                    encontrado = true;
                }
                
            }
            if(encontrado){
                System.out.println("Encontrado" + cont + "veces");
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

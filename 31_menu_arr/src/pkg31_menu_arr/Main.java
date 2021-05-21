/*
31.- Realiza un programa que gestione una tabla ordenada ascendentemente
y con un máximo de 10 elementos. No se
permitirán repetidos:
Menú: 
1.­ Introducir número entero. 
2.­ Listar números. 
3.­ Eliminar número. 
4.­ Eliminar todos los números. 
5.­ Salir.
 */
package pkg31_menu_arr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op = 0;
        final int NUM = 10;
        int[] arr = new int[NUM];
        int cont = 0; //Aguja y saber cuantos numeros hay
        boolean encontrado;
        int aux;
        
        while(op != 5){
            
            System.out.println("Menú: \n" +
            "1.­ Introducir número entero. \n" +
            "2.­ Listar números. \n" +
            "3.­ Eliminar número. \n" +
            "4.­ Eliminar todos los números. \n" +
            "5.­ Salir.");
            op = sc.nextInt();
            
            switch(op){
                
                case 1: //Intro numero
                    
                    if(cont == NUM){
                        System.out.println("Esta lleno en array");
                    }
                    
                    else{
                        
                        System.out.println("Numero:");
                        aux = sc.nextInt();
                        encontrado = false;
                        
                        for (int i = 0; i < cont && !encontrado; i++) {
                            
                            if(arr[i] == aux){
                                encontrado = true;
                            }
                        }
                        
                        if(!encontrado){
                            arr[cont] = aux;
                            cont++;
                        }
                        else{
                            System.out.println("Repetido");
                        }
                    }
                    break;
                    
                case 2: //Listar, acuerdate que es hasta cont
                    
                    for (int i = 0; i < cont; i++) {
                        System.out.println(arr[i]);
                    }
                    break;
                    
                case 3: //Eliminar numero
                    
                    System.out.println("Numero a eliminar");
                    aux = sc.nextInt();
                    encontrado = false;
                    
                    for (int i = 0; i < cont && !encontrado; i++) {
                        
                        if(aux == arr[i]){
                            
                            encontrado = true;
                            //Numero encontrado en la posicion i
                            for (int j = i; j < cont - 1; j++) {
                                arr[j] = arr[j+1];
                            }
                            
                        }
                        
                    }
                    
                    if(encontrado){
                        cont--; 
                        System.out.println("Eliminado");  
                    }
                    else{
                        System.out.println("No existe");
                    }

                    break;
                case 4: //Eliminar todos
                    cont = 0;
                    break;
                case 5: //Salir
                    break;
                default:
                    System.out.println("La opcion ha de estar entre 1 y 5");
                    break;
            }
           
        }
        sc.close();
        
    }
    
}

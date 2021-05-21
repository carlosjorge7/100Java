/*
32.- Realiza un programa que gestione una tabla de hasta 8 cadenas.
No se permitirán cadenas repetidas, y el
orden de entrada es irrelevante.
Menú:
1.- Introducir cadena.
2.- Listar cadenas.
3.- Eliminar cadena.
4.- Eliminar todas las cadenas.
5.- Salir.
 */
package pkg32_menu_arr_string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            String[] cadenas = new String[10];
            int cont = 0;
            String opcion = "0";
            String aux;
            boolean encontrado;
            
            while(!opcion.equals("5")){
                
		// Mostrar menú
		System.out.println("Menú:\n" +
		"1.­ Introducir cadena.\n" +
		"2.­ Listar cadenas.\n" +
		"3.­ Eliminar cadena.\n" +
		"4.­ Eliminar todas las cadenas.\n"+
		"5.­ Salir.");
		opcion = sc.nextLine();
                
		switch (opcion){
                    
			case "1": // Introducir número
				// Si el array está lleno
                            if(cont == cadenas.length){
				System.out.println("Array lleno.");
                            }
                            else{
                                
                                System.out.print("Cadena: ");
                                aux = sc.nextLine();
                                encontrado = false;
                                
                                for (int i = 0; i < cont && !encontrado; i++){
                                    
                                    if(aux.equals(cadenas[i])){
                                        encontrado = true;
                                    }   
                                }
                                if(!encontrado){
                                    cadenas[cont] = aux;
                                    cont++;
                                }
                                else{
                                    System.out.println("Repetida.");
                                }
                            }
                            break;
                            
			case "2": // Listar
                            for (int i = 0; i < cont; i++){
				System.out.println(cadenas[i] + " ");
                            }
                            break;
                        
			case "3": // Eliminar cadena
                      
                            if(cont == 0){
                                System.out.println("Array vacio");
                            }
                            
                            System.out.println("Cadena a eliminar");
                            aux = sc.nextLine();
                            encontrado = false;
                    
                            for (int i = 0; i < cont && !encontrado; i++) {
                        
                                if(aux.equals(cadenas[i])){
                                    encontrado = true;
                            
                                    for (int j = i; j < cont - 1; j++) {
                                        cadenas[j] = cadenas[j+1];
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
                        
			case "4": // Eliminar todas
                            cont = 0;
                            break;
                        
			case "5": // Salir
                            break;
                        
			default:
				System.out.println("Opción no válida.");
                            break;
			}
		}
		sc.close();
	}
}
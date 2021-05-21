/*
46.- Realiza un programa con un menú de opciones que ofrezca las siguientes 
posibilidades:
Menú:
1.-Introducir nombre.
2.-Listar nombres.
3.-Buscar nombre. (Se mostrarán todos los nombres que contengan la cadena de
búsqueda)
4.-Eliminar nombre.
5.-Eliminar todos los nombres.
6.-Salir.
NOTA: Se podrán almacenar hasta un máximo de 10 nombres. No se permitirán nombres
repetidos.
Los nombres no son sensibles a mayúsculas
 */
package pkg46_nombres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];
        String nombre;
        boolean encontrado;
        int cont = 0;
        String op = "0";
        
        while(!op.equals("6")){
            
            System.out.println("Menú:\n" +
            "1.-Introducir nombre.\n" +
            "2.-Listar nombres.\n" +
            "3.-Buscar nombre. (Se mostrarán todos los nombres que contengan la cadena de\n" +
            "búsqueda)\n" +
            "4.-Eliminar nombre.\n" +
            "5.-Eliminar todos los nombres.\n" +
            "6.-Salir.");
            op = sc.nextLine();
            
            switch(op){
                
                case "1": //Intoducir nombre
                    
                    if(cont == nombres.length){
                        System.out.println("Esta lleno");
                    }
                       
                    System.out.println("Nombre:");
                    nombre = sc.nextLine();
                    encontrado = false;
                        
                    for (int i = 0; i < cont && !encontrado; i++) {
                            
                        if(nombre.equalsIgnoreCase(nombres[i])){
                            encontrado = true; //Esta repetido
                        }
                    }
                        
                    if(!encontrado){
                        nombres[cont] = nombre;
                        cont++;
                    }
                    else{
                        System.out.println("Nombre repetido");
                    }
                    
                    break;
                    
                case "2": //Listar nombres
                    
                    for (int i = 0; i < cont; i++) {
                        System.out.println(nombres[i]);
                    }
                
                    break;
                
                case "3": //Buscar nombre
                    
                    System.out.println("Nombre a buscar");
                    nombre = sc.nextLine();
                    encontrado = false;
                    
                    for (int i = 0; i < cont && !encontrado; i++) {
                        
                        if(nombres[i].contains(nombre)){
                            encontrado = true;
                        }
                    }
                    if(encontrado){
                        System.out.println("Encontrado");
                    }
                    else{
                        System.out.println("No existe");
                    }
                    break;
                    
                case "4": //Eliminar nombre
                    
                    if(cont == 0){
                        System.out.println("Array vacio");
                    }
                    
                    System.out.println("Nombre a eliminar");
                    nombre = sc.nextLine();
                    encontrado = false;
                    
                    for (int i = 0; i < cont && !encontrado; i++) {
                        
                        if(nombre.equals(nombres[i])){
                            encontrado = true;
                            
                            for (int j = i; j < cont - 1; j++) {
                                nombres[j] = nombres[j+1];
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
                    
                case "5": //Eliminar todos los nombres
                    cont = 0;
                    break;
                    
                case "6": //Salir
                    
                    break;
                
                default: 
                    System.out.print("Ninguna d las anteriores");
                    break;
                    
                    
            }
            
        }
        
    }
    
}


package pkg53_nombres;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String op = "";
        Nombres nombres = new Nombres(10);
        String nombre;
        
        
        while(!op.equals("6")){
            
            System.out.println("1 - Añadir nombre");
            System.out.println("2 - Listar nombres");
            System.out.println("3 - Buscar nombre");
            System.out.println("4 - Eliminar nombre");
            System.out.println("5 - Eliminar todos los nombres");
            System.out.println("6 - Salir");
            
            System.out.print("Elige una opcion");
            op = sc.nextLine();
            
            switch(op){
                
                case "1": //Añadir nombre, no se admiten repetidos
                    
                    System.out.println("Introduce un nombre");
                    nombre = sc.nextLine();
                    if(nombres.estaLlena()){
                        System.out.print("Lleno");
                    }
                    else{
                        
                        if(nombres.buscarNombe(nombre)){
                            System.out.print("Repetido");
                        }
                        else{
                            nombres.anadirNombre(nombre);
                        }
                    }
                    
                    break;
                    
                case "2": //Listar nombres
                    for (int i = 0; i < nombres.getNumeroNombres(); i++) {
                        
                        System.out.println(nombres.getNombre(i));
                        
                    }
                    break;
                    
                case "3": //Buscar nombre
                    
                    System.out.println("Nombre a buscar");
                    nombre = sc.nextLine();
                    
                    if(nombres.buscarNombe(nombre)){
                        System.out.println("Nombre encontrado");
                    }
                    else{
                        System.out.println("No existe");
                    }
                    
                    
                    break;
                    
                case "4":// Eliminar nombres
                    
                    System.out.println("Nombre a eliminar");
                    nombre = sc.nextLine();
                    
                    if(nombres.eliminarNombre(nombre)){
                        
                        System.out.println("Eliminado");
                    }
                    else{
                        System.out.println("No existe, asi que no se puede eliminar");
                    }
                   
                    break;
                    
                case "5": //Eliminar todos
                    nombres.vaciar();
                    break;
                    
                case "6": //Salir
                    break;
                    
                default:
                    System.out.print("Opcion no valida");
                    break;
                    
            }
        }
    }
    
}
package ejercicio81;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio81 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        TreeSet<Jugador> jugadores = new TreeSet<>();
      
        String nombre;
        int estatura;
        
        String op = "0";
        
        while(!op.equals("5")){
            
            System.out.println("1 - Introducir jugador");
            System.out.println("2 - Listar jugadores");
            System.out.println("3 - Eliminar jugador");
            System.out.println("4 - Borrar todos");
            System.out.println("5 - Salir");
            
            System.out.println("Elige una de las 5 opciones");
            op = sc.nextLine();
            
            switch(op){
                
                case "1": //Intro jugador
                    System.out.println("Introduce su nombre");
                    nombre = sc.nextLine();
                    if(jugadores.contains(new Jugador(nombre, -1))){
                       System.out.println("Nombre repetido");
                    }
                    else{
                           System.out.println("Introduce su estatura");
                           estatura = Integer.parseInt(sc.nextLine());
                           jugadores.add(new Jugador(nombre, estatura));
                    }
                    
                    break;
                    
                case "2": //Listar jugadores
                    
                    for(Jugador jugador : jugadores){
                       System.out.println("Nombre" + jugador.getNombre() + "Estatura" + jugador.getEstatura());
                    }
                    break;
                    
                case "3": //Eliminar jugador
                    System.out.println("Introduce su nombre");
                    nombre = sc.nextLine();
                    
                    boolean existe = jugadores.contains(new Jugador(nombre,-1));
                    if(existe == true){
                        jugadores.remove(new Jugador(nombre, -1));
                    }
                    else{
                        System.out.println("El jugador no existe");
                    }
                    break;
                    
                case "4": //Borrar todos
                    jugadores.clear();
                    break;
                    
                case "5":
                    break;
                
                default:
                    System.out.print("Opcion no valida");
                    
                    
            }
        }
        
    }
    
}

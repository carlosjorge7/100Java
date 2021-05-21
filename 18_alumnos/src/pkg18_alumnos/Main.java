/*
18.- Programa que lee el nombre y edad en años de una serie de alumnos
hasta introducir como nombre de
alumno “fin”. En ese momento mostrará la edad media de
los alumnos y el nombre del alumno menor.
 */
package pkg18_alumnos;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String nombre_menor = "";
        int edad;
        int suma_edades = 0;
        int edad_menor = Integer.MAX_VALUE;
        int cont = 0; //Para saber el numero de alumnos introducidos
        
        System.out.println("Nombre del alumno:");
        nombre = sc.nextLine();
        
        do{
           
            System.out.println("Edad del alumno:");
            edad = Integer.parseInt(sc.nextLine());
            
            suma_edades += edad;
            cont++;
            
            if(edad < edad_menor){
                edad_menor = edad;
                nombre_menor = nombre;
            }
            System.out.println("Nombre del alumno:");
            nombre = sc.nextLine();
            
        }
        while(!nombre.equals("fin"));
        
        System.out.println("MEDIA =" + (suma_edades / cont));
        System.out.println("Nombre del menor alumno ="  + nombre_menor);
        
    }
    
}

/*
Crea una clase aparte con el método main:

Crea un array de 4 empleados. Los datos de cada empleado será leidos por consola.

Muestra los datos de cada empleado del array.

Llama al método getNumeroEmpleados para mostrar el número de empleados
instanciados.
 */
package pkg55_empleados;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Empleado[] empleados = new Empleado[4];
        
        String nombre, telefono;
        
        //Imput
        for (int i = 0; i < empleados.length; i++) {
            
            System.out.println("Nombre");
            nombre = sc.nextLine();
            
            System.out.println("Telefono");
            telefono = sc.nextLine();
            
            empleados[i] = new Empleado(nombre, telefono);
        }
        
        //Output
        for (int i = 0; i < empleados.length; i++) {
            
            System.out.println("Nombre:" + empleados[i].getNombre() + " " +
                    "Telefono:" + empleados[i].getTelefono());
            
        }
        
        //System.out.println("Numero de empleados instanciados:" + Empleado.getNumEmpleados());
    }
    
}

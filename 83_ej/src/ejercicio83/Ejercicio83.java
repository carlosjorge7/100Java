/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio83;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio83
{

	public static void main(String[] args)
	{
		LinkedList<String> cola = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		String opcion = "";
                String nombre;
                
		while(!opcion.equals("6"))
		{
			mostrarMenu();
			opcion = sc.nextLine();
			switch(opcion)
			{
				case "1": // Listar
					for(String n: cola)
					{
						System.out.print(n + " ");
					}
					
				break;
				case "2": // Añadir por el final
					System.out.print("Nombre: ");
                                        nombre = sc.nextLine();
					cola.addLast(nombre);
				break;

				case "3": // Extraer por el principio
					if(cola.isEmpty())
					{
						System.out.print("La cola esta vacia");
					}
                                        else{
                                            cola.removeFirst();
                                        }
				break;

				case "4": // Eliminar
					System.out.print("Nombre: ");
                                        nombre = sc.nextLine();
					if(cola.contains(nombre))
					{
						cola.remove(nombre);
					}
                                        else{
                                            System.out.print("El nmbre no existe en la cola");
                                        }
				break;

				case "5": // Eliminar todos
					cola.clear();
				break;

				case "6": // Salir
				break;

				default:
					System.out.println("Opción no válida.");

			}
		}
		sc.close();

	}

	public static void mostrarMenu()
	{
		System.out.println("Opciones:\n" +
			"1.- Listar nombres\n" +
			"2.- Añadir nombre\n" +
			"3.- Extraer nombre\n" +
			"4.- Eliminar nombre\n" +
			"5.- Eliminar todos\n" +
			"6.- Salir");
	}

}

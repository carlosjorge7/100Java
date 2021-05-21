/*
 * 76 - Escribe un programa que utilizando una colección HashSet permita, a través de

un menú, gestionar una lista de palabras de número ilimitado donde no se
permitirán palabras repetidas y siendo el orden de las mismas totalmente
irrelevante:
Opciones
1.-Introducir palabra
2.-Listar palabras
3.-Eliminar palabra
4.-Borrar todas
5.-Mostrar tamaño
6.-Buscar
7.-Salir
*/

package ejercicio76;

import java.util.HashSet;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String op = "0";
		HashSet<String> hsPalabras = new HashSet<>();
		
		while(!op.equals("7"))
		{
			Menu();
			op = sc.nextLine();
			switch(op) 
			{
				case "1": //Intro palabra
					
					System.out.println("Palabra a introducir");
					String palabra = sc.nextLine();
					if(hsPalabras.add(palabra)){
						System.out.println("Añadida con exito");
					}
					else {
						System.out.println("La palabra ya existe, lo siento");
					}
					break;
					
				case "2": //Listar
					
					for(String pal : hsPalabras)
					{
						System.out.println(pal);
					}
					break;
				
				case "3": //Eliminar palabra
					
					System.out.println("Palabra a eliminar");
					String eliminar = sc.nextLine();
					if(hsPalabras.remove(eliminar)) {
						System.out.println("Palabra eliminada con exito");
					}
					else {
						System.out.println("Palabra no encontrada, no puedo eliminarla si no existe");
					}
					break;
					
				case "4": //Borrar todas
					
					hsPalabras.clear();
					break;
					
				case "5": //Mostrar el tamaño del arrayList
					
					hsPalabras.size();
					break;
					
				case "6": //Buscar palabra
					
					System.out.println("Palabra a buscar");
					String buscar = sc.nextLine();
					if(hsPalabras.contains(buscar))
					{
						System.out.println("Palabra encontrada");
					}
					else 
					{
						System.out.println("Palabra no encontrada");
					}
					break;
				
				case "7": //Salir
					
					break;
				
				default:
					
					System.out.println("Op no valida");
					break;
			}
		}
		
	}
	private static void Menu()
	{
		System.out.println("Opciones\n" +
		"1.-Introducir palabra\n" +
		"2.-Listar palabras\n" +
		"3.-Eliminar palabra\n" +
		"4.-Borrar todas\n" +
		"5.-Mostrar tamaño\n" +
		"6.-Buscar\n" +
		"7.-Salir");
	}
	
}

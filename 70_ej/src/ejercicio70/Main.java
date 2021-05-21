package ejercicio70;
import java.util.Scanner;

import java.security.InvalidParameterException;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Alumno[] alumnos = new Alumno[5];
		
		String nombre;
		double nota;
		int edad;
		
		for (int i = 0; i < alumnos.length; i++) 
		{
			System.out.println("Alumno");
			nombre = sc.nextLine();
			
			boolean error = false;
			
			do 
			{
				try 
				{
					System.out.println("Edad");
					edad = sc.nextInt();
					
					alumnos[i] = new Alumno(nombre, edad);
				}
				catch(NumberFormatException e) 
				{
					System.out.println("La edad no es un numero");
					error = true;
				}
				catch(InvalidParameterException e) 
				{
					System.out.println("Es una edad negativa");
					error = true;
				}
				
			}
			while(error == true);
			
			do 
			{
				try 
				{
					System.out.println("Edad");
					nota = sc.nextDouble();
					
					alumnos[i].setNota(nota);
				}
				catch(NumberFormatException e) 
				{
					System.out.println("La nota no es un numero");
					error = true;
				}
				catch(InvalidParameterException e) 
				{
					System.out.println("Es una nota negativa");
					error = true;
				}
				
			}
			while(error == true);
		}
		
		System.out.println("Listado de alumnos:");
		for(Alumno alumno: alumnos ) 
		{
			System.out.println("Nombre:" + alumno.getNombre() + 
					"Nota:" + alumno.getNota() +
					"Edad:" + alumno.getEdad());
		}
		
	}
}

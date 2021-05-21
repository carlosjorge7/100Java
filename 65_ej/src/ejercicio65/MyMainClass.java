package ejercicio65;
import java.util.*;

public class MyMainClass
{
	public static void main(String[] args) 
	{
	
		final int NUM_ALUMNOS = 10;
		Alumno[] alumnos = new Alumno[NUM_ALUMNOS];
		String nombre;
		String strNotas;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < alumnos.length; i++) 
		{
			//Nombre
			System.out.println("Nombre");
			nombre = sc.nextLine();
			alumnos[i] = new Alumno(nombre);
			
			//Nota
			System.out.println("Intro las 10 notas separadas por un espacio");
			strNotas = sc.nextLine();
			
			int nota;
			//Pasamos las notas al objeto scLinea
			Scanner scLinea = new Scanner(strNotas);
			//Mientras que scLinea tenga un siguente entero , seguims
			//Dicho de otra forma, mientras que haya una nota posterior, seguimos
			while(scLinea.hasNextInt()) 
			{
				nota = scLinea.nextInt();
				if(!alumnos[i].anadeNota(nota)) 
				{
					System.out.println("La nota" + nota + "no se pudo añadir");
				}
			}
		}
		System.out.println("Listado:");
		System.out.println("Nombre\tNúmero\tAprobados\tMedia");
		for (int i = 0; i < alumnos.length; i++)
		{
			System.out.println(alumnos[i].getNombre() + "\t"
					+ alumnos[i].numNotas() + "\t" 
					+ alumnos[i].getNumeroAprobados() + "\t"
					+ alumnos[i].getNotaMedia()
					);
		}
	}
}

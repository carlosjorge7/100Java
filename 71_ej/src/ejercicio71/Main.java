package ejercicio71;


import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{

		Alumno[] alumnos = new Alumno[3];
		Scanner sc = new Scanner(System.in);

		String nombre;
		int edad;
		double nota;

		for (int i = 0; i < alumnos.length; i++)
		{
			System.out.print("Nombre: ");
			nombre = sc.nextLine();

			boolean error;

			do
			{
				error = false;
				try
				{
					System.out.print("Edad: ");
					edad = Integer.parseInt(sc.nextLine());
					alumnos[i] = new Alumno(nombre,edad);
				}
				catch(NumberFormatException e)
				{

					System.out.println("No es una edad numérica.");
					error = true;
				}
				catch(EdadNoValidaException e)
				{
					System.out.println(e.getMessage());
					error = true;
				}
			}
			while(error);


			do
			{
				error = false;
				try
				{
					System.out.print("Nota: ");
					nota = Double.parseDouble(sc.nextLine());
					alumnos[i].setNota(nota);
				}
				catch(NumberFormatException e)
				{
					System.out.println("No es una nota numérica.");
					error = true;
				}
				catch(NotaNoValidaException e)
				{
					System.out.println(e.getMessage());
					error = true;
				}
			}
			while(error);
		}
		sc.close();
		System.out.println("Listado:");
		for(Alumno alumno: alumnos)
		{
			System.out.println(alumno.getNombre() + " " +
					alumno.getEdad() + " " +
					alumno.getNota());
		}
	}
}
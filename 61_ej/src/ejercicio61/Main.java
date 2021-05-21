package ejercicio61;

public class Main
{

	public static void main(String[] args)
	{
		// Programador programador = new Empleado("pepe", "23234");
		Empleado[] empleados = new Empleado[2];
		empleados[0] = new Empleado("antonio", "234234");
		empleados[1] = new Programador("pepe", "243432", "kotlin", "Dart");

		for (int i = 0; i < empleados.length; i++)
		{
			if(empleados[i] instanceof Programador)
			{
				System.out.println("Programador:");
				System.out.println(empleados[i].getNombre());
				System.out.println(empleados[i].getTel());
				Programador programador = (Programador) empleados[i];
				String[] lenguajes = programador.getLenguajes();
				for (int j = 0; j < lenguajes.length; j++)
				{
					System.out.println(lenguajes[j]);
				}
			}
			else
			{
				System.out.println("Empleado:");
				System.out.println(empleados[i].getNombre());
				System.out.println(empleados[i].getTel());
			}
		}

	}

}


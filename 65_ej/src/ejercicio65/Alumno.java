package ejercicio65;

public class Alumno implements IAlumno
{
	private String nombre;
	private int[] notas;
	private final int NUM_NOTAS = 10;
	private int cont; //IMP cont de notas
	
	public Alumno(String nombre) 
	{
		this.nombre=nombre;
		notas = new int[NUM_NOTAS];
		cont = 0; //Acaba de empezar el curso .. no hay notas
	}
	
	@Override
	public String getNombre() 
	{
		return nombre;
	}

	@Override
	public boolean anadeNota(int nota) 
	{
		if(nota < 1 || nota > 10) 
		{
			return false;
		}
		if(cont == notas.length)
		{
			return false;
		}
		//Metodo aguja, cont de apuntador para cargar la nota en el array notas
		notas[cont] = nota;
		cont++;
		return true;
	}

	@Override
	public int[] getNotas()
	{
		//Copiamos el array notas en otro aux, y lo devolvemos
		int[] auxNotas = new int[cont];
		
		for (int i = 0; i < cont; i++) 
		{
			auxNotas[i] = notas[i];
		}
		return auxNotas;
	}

	@Override
	public int numNotas() 
	{
		return cont;
	}

	@Override
	public float getNotaMedia() 
	{
		if(cont == 0)
		{
			return -1;
		}
		int sumNotas = 0;
		for (int i = 0; i < cont; i++) 
		{
			sumNotas += notas[i];
		}
		return (float)sumNotas / cont;
	}

	@Override
	public int getNumeroAprobados() 
	{
		int aprobados = 0;
		for (int i = 0; i < cont; i++) 
		{
			if(notas[i] >= 5) 
			{
				aprobados++;
			}
		}
		return aprobados;
	}

	@Override
	public void borrarNotas() 
	{
		cont = 0;
	}
	
}

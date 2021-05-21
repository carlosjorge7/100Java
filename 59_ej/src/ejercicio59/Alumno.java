package ejercicio59;

public class Alumno 
{
	private String nombre;
	private double[] notas;
	
	public static double SIN_NOTA = -1;
	
	public Alumno(String nombre)
	{
		this.nombre=nombre;
		notas = new double[3];
		//Creamos un espacio de memoria previo(array) en el que cada i no tiene nota aun
		for (int i = 0; i < notas.length; i++) 
		{
			notas[i] = SIN_NOTA;
		}
	}
	
	public void setNoombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	//Este boolean tiene una doble funcionalidad
		//1__false or true si la nota y la evaluacion no son validas
		//2__Agregamos una nota
	public boolean ponerNota(int evaluacion, double nota) 
	{
		if(!Validar.evaluacionValida(evaluacion) || !Validar.notaValida(nota))
		{
			return false;
		}
		notas[evaluacion - 1] = nota;
		return true;
	}
	//Este boolean tienen una doble funcionalidad:
		//1__false or true si la evaluacion no es valida
		//2__Vaciar la nota
	public boolean borrarNota(int evaluacion)
	{
		if(!Validar.evaluacionValida(evaluacion)) 
		{
			return false;
		}
		notas[evaluacion - 1] = SIN_NOTA;
		return true;
	}
	
	public int numeroNotas() 
	{
		int contNotas = 0;
		for (int i = 0; i < notas.length; i++) 
		{
			if(notas[i] != SIN_NOTA) 
			{
				contNotas++;
			}
		}
		return contNotas;
	}
	
	public double notaMaxima() 
	{
		double maxima = SIN_NOTA;
		for (int i = 0; i < notas.length; i++) 
		{
			if(notas[i] > maxima) 
			{
				maxima = notas[i];
			}
		}
		return maxima;
	}
	
	public boolean tieneNota(int evaluacion) 
	{
		if(!Validar.evaluacionValida(evaluacion))
		{
			return false;
		}
		return notas[evaluacion - 1] != SIN_NOTA; //True
		
		
		/*for (int i = 0; i < notas.length; i++) 
		{
			if(!Validar.evaluacionValida(evaluacion) || notas[i] == SIN_NOTA)
			{
				return false;
			}
		}
		return true;*/
	}
	
	public double getNota(int evaluacion) 
	{
		if(!Validar.evaluacionValida(evaluacion)) 
		{
			return -1;
		}
		return notas[evaluacion -1];
	}
	
}

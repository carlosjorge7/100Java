package ejercicio59;

public class Validar 
{
	/*Nos creamos esta clase simplemente para saber si los parametros introducidos ev y nota son validos*/
	public static boolean evaluacionValida(int evaluacion) 
	{
		if(evaluacion < 1 || evaluacion > 3) 
		{
			return false;
		}
		return true;
	}
	
	public static boolean notaValida(double nota) 
	{
		if(nota < 0 || nota > 10) 
		{
			return false;
		}
		return true;
	}
	/*acemos static ya que esta clase Validar(fija) se tiene que comunicar con la clase 
	Alumno sin problemas.. por eso ponemos static*/
}

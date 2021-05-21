package ejercicio70;
import java.security.InvalidParameterException;


public class Alumno 
{
	private String nombre;
	private int edad;
	private double nota;
	
	public Alumno(String nombre, int edad)
	{
		if(edad < 0)
		{
			throw new InvalidParameterException();
		}
		this.nombre = nombre;
		this.edad = edad;
	}
	public double getNota()
	{
		return nota;
	}
	public void setNota(double nota)
	{
		if(nota < 0 || nota > 10)
		{
			throw new InvalidParameterException();
		}
		this.nota = nota;
	}
	public String getNombre()
	{
		return nombre;
	}
	public int getEdad()
	{
		return edad;
	}
}

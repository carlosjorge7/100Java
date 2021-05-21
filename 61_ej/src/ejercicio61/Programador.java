package ejercicio61;


public class Programador extends Empleado
{
	private String[] lenguajes;
	public Programador(String nombre, String telefono, String ... lenguajes)//el ... indica que hay nuevo att en la clase hijo
	{
		super(nombre, telefono); //super calca los atributos de la clase padre en la clase hijo
		this.lenguajes = lenguajes;
	}

	public String[] getLenguajes()
	{
		return lenguajes;
	}
}
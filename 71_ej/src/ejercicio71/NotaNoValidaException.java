package ejercicio71;

public class NotaNoValidaException extends Exception
{
	private static final long serialVersionUID = 49811139247605752L;

	public NotaNoValidaException()
	{
		super("Nota no válida.");
	}

	public NotaNoValidaException(String mensaje)
	{
		super(mensaje);
	}
}

package ejercicio71;


public class EdadNoValidaException extends Exception
{

	private static final long serialVersionUID = -1349811139247605752L;

	public EdadNoValidaException()
	{
		super("Edad no válida.");
	}

	public EdadNoValidaException(String mensaje)
	{
		super(mensaje);
	}

}


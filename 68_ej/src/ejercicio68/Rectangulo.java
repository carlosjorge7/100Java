package ejercicio68;

public class Rectangulo extends Forma
{
	public Rectangulo(String nombre, float base, float altura, float posX, float posY, String color)
	{
		super(nombre, base, altura, posX, posY, color);
	}
	
	@Override
	
	public float calcularArea() 
	{
		return getBase() * getAltura();
	}
	
}

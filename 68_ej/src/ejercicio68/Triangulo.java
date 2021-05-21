package ejercicio68;

public class Triangulo extends Forma
{
	public Triangulo(String nombre, float base, float altura, float posX, float posY, String color)
	{
		super(nombre, base, altura, posX, posY, color);
	}
	
	@Override
	
	public float calcularArea() 
	{
		return (getBase() * getAltura()) / 2;
	}
}

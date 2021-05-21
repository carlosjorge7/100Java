package ejercicio58;

public class Rectangulo 
{
	private float base = 1;
	private float altura = 1;
	private float x = 0;
	private float y = 0;
	//Constructores
	public Rectangulo(float base, float altura, float x, float y) 
	{
		//Establecemos los primeros valores de los tt
		this.base=base;
		this.altura=altura;
		this.x=x;
		this.y=y;
	}
	public Rectangulo(float base, float altura) 
	{
		this.base=base;
		this.altura=altura;
	}
	public Rectangulo(float base) 
	{
		this.base=base;
	}
	public Rectangulo() {
		
	}
	//getters and setters
	public float getBase()
	{
		return base;
	}
	public void setBase(float base)
	{
		this.base = base;
	}
	public float getAltura()
	{
		return altura;
	}
	public void setAltura(float altura)
	{
		this.altura = altura;
	}
	public float getX()
	{
		return x;
	}
	public void setX(float x)
	{
		this.x = x;
	}
	public float getY()
	{
		return y;
	}
	public void setY(float y)
	{
		this.y = y;
	}
	
	
	public float getArea(float base, float altura)
	{
		float area;
		area = base * altura;
		return area;
	}
	public float getPerimetro(float base, float altura) 
	{
		float per;
		per = 2*base + 2*altura;
		return per;
	}
	//Ojo, void solo hace una operacion
	public void agranda(float aumentaBase, float aumentaAltura)
	{
		base = base + aumentaBase;
		altura += aumentaAltura;
	}
	
	public void agranda(float aumento) 
	{
		base += aumento;
		altura += aumento;
	}
	public void agranda()
	{
		base++;
		altura++;
	}
}

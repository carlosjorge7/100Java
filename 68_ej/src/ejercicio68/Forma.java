/*68.- Crea una clase abstracta llamada Forma:
• Con los siguientes atributos:
◦ String nombre
◦ float base, float altura
◦ float posicionX, float posicionY
◦ String color
• Con el siguiente método abstracto:
◦ float calcularArea( )
• Con los siguientes métodos no abstractos:
◦ Getters y setters de los atributos.
•
•
•
•
Comprueba que no se puede instanciar la clase abstracta Forma.
Crea una clase llamada Triangulo que herede de la clase Forma. Define en ella el
método calcularArea.
Crea una clase llamada Rectangulo que herede de la clase Forma. Define en ella el
método calcularArea.
Crea una clase aparte con el método main para probar todas las funcionalidades de las
subclases Triangulo y Rectangulo.*/

package ejercicio68;

public abstract class Forma
{
	private String nombre;
	private float base, altura;
	private float posX, posY;
	private String color;
	
	public Forma(String nombre, float base, float altura, float posX, float posY, String color) {
		super();
		this.nombre=nombre;
		this.base=base;
		this.altura=altura;
		this.posX=posX;
		this.posY=posY;
		this.color=color;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
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
	public float getPosX()
	{
		return posX;
	}
	public void setPosX(float posX)
	{
		this.posX = posX;
	}
	public float getPosY()
	{
		return posY;
	}
	public void setPosicionY(float posY)
	{
		this.posY = posY;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	//Este metodo no se desarrolla, ya que se implemtentara en otra clase, no pueden ser implementados en esta
	public abstract float calcularArea();
	
}

package ejercicio68;

public class Main 
{
	public static void main(String[] args) 
	{
		//Forma forma = new Forma(null, 1f, 1f, 0f, 0f, null);
		Triangulo t = new Triangulo("Triangulo", 3f, 2f, 5.6f, 10.1f, "#F3A");
		System.out.println(t.getNombre() + "tiene un area de" + t.calcularArea());
		
		Rectangulo r = new Rectangulo("Rectangulo", 5f, 2.5f, 1.1f, 2.2f, "#F3A");
		System.out.println(r.getNombre() + "tiene un area de" + r.calcularArea());
	}
}

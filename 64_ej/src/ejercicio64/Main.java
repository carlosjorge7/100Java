package ejercicio64;

public class Main 
{
	public static void main(String[] args) 
	{
		Naipes naipes = new Naipes();
		
		System.out.println("Traducciones:");
		for (int i = 1; i <= 40; i++) 
		{
			System.out.println(naipes.traducir(i));
		}
		System.out.println("Extraer carta de arriba");
		System.out.println(naipes.traducir(naipes.extraerCartaArriba()));
		System.out.println("Numero de cartas en el mazo" + naipes.getNumCartas());
		
		System.out.println("Extraccion por posicion");
		System.out.println(naipes.traducir(naipes.extraerCarta(1)));
		System.out.println(naipes.traducir(naipes.extraerCarta(37)));
		
		System.out.println(naipes.ponerCarta(10));
		System.out.println(naipes.ponerCarta(1));

	}
}

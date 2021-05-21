package ejercicio64;
import java.util.Random;

public class Naipes implements INaipes
{
	private static final String[] PALOS = {"Oros", "Copas", "Espadas", "Bastos"};
	private static final String[] FIGURAS = {"As", "Dos","Tres","Cuatro","Cinco","Seis","Siete",
			"Sota","Caballo","Rey"};
	private int cont; //Para llevar el contador de las 40 cartas
	private int[] naipes = new int[40]; //Array con todas las cartas
	
	//Constructor para darle un valor a cada carta, vamos a asignar ala pos [i] la carta i+1
	public Naipes() 
	{
		for (int i = 0; i < naipes.length; i++) 
		{
			naipes[i] = i + 1;
		}
		cont = naipes.length;
	}
	@Override
	public String traducir(int numCarta)
	{
		if(numCarta < 1 || numCarta > 40) 
		{
			return "";
		}
		
		return FIGURAS[numCarta % 10] + "de" + PALOS[numCarta / 10];
	}
	
	@Override
	
	public void barajar() 
	{
		Random random = new Random();
		int aux; //Variable contenedor para intercambiar las cartas
		int j; //Indice el cual vamos a cambiar, aleatorio
		
		for (int i = 0; i < cont; i++) 
		{
			j = random.nextInt(cont);//Elige un num aleatorio del cont (1 al 40)
			
			aux = naipes[i];
			naipes[i] = naipes[j];
			naipes[j] = aux;
		}
	}
	

	@Override
	public int extraerCartaAlAzar() 
	{
		if(cont == 0)
		{
			return 0;
		}
		Random random = new Random();
		int iPosicion = random.nextInt(cont); //Extraemos la posicion aleatoriamente
		int carta = naipes[iPosicion]; //La carta en cuestion
		
		for (int i = iPosicion; i < cont; i++) 
		{
			naipes[i] = naipes[i+1];
		}
		cont--;
		return carta;
	}
	
	@Override
	public int extraerCartaArriba() 
	{
		if(cont == 0)
		{
			return 0;
		}
		int carta = naipes[cont -1];
		cont--;
		return carta;
		
	}
	
	@Override
	public int extraerCarta(int posicion) 
	{
		if(cont == 0 || posicion >= cont)
		{
			return -1;
		}
		
		int carta = naipes[posicion];
		for (int i = posicion; i < cont; i++) 
		{
			naipes[i] = naipes[i+1];
		}
		cont--;
		return carta;
	}
	
	@Override
	public boolean ponerCarta(int numCarta) 
	{

		if(numCarta < 1 || numCarta > naipes.length)
		{
			return false;
		}
		if(cont == naipes.length)
		{
			return false;
		}
		
		//Si encontramos la carta nos salimos con false
		for (int i = 0; i < naipes.length; i++)
		{
			if(numCarta == naipes[i]) 
			{
				return false;
			}
		}
		naipes[cont] = numCarta;
		cont++;
		return true;
	}
	
	@Override
	public int getNumCartas()
	{
		return cont;
	}
	
	@Override
	public void ordenar() //De menor a mayor
	{
		int aux;
		for (int i = 0; i < cont; i++)
		{
			for (int j = i + 1; j < cont; j++)
			{
				if(naipes[j] < naipes[i])
				{
					aux = naipes[j];
					naipes[j] = naipes[i];
					naipes[i] = aux;
				}
			}
		}
	}
}

package ejercicio63;

public class CajaRegistradora implements ICajaRegistradora 
{
	private Bandeja[] bandejas;
	private String nombre; 
	
	private final static double[] tipoMonedas = {0.02d, 0.05d, 0.1d, 0.2d, 0.5d, 1d, 2d, 5d, 
			10d, 20d, 50d, 100d, 200d};
	
	public CajaRegistradora(String nombre) 
	{
		this.nombre=nombre;
		
		bandejas = new Bandeja[tipoMonedas.length];
		
		for (int i = 0; i < tipoMonedas.length; i++) 
		{
			bandejas[i] = new Bandeja(tipoMonedas[i]);
			//Cada bandeja se corresponde con un tipo de moneda, uno a uno, bandejas de 1, de 5 de 10..
		}
	}
	
	@Override
	public String getNombre() 
	{
		return nombre;
	}
	@Override
	//Cuennta las unidades que hay en una bandeja cualquiera
	public int getNumTipoMonedas()
	{
		int contTipos = 0;
		//return contTipos = bandejas.length;
		for (int i = 0; i < bandejas.length; i++)
		{
			if(bandejas[i].getCont() > 0)
			{
				contTipos++;
			}
		}
		return contTipos;
	}
	
	private int posicionTipoMoneda(double tipo) 
	{
		for (int i = 0; i < bandejas.length; i++)
		{
			if(bandejas[i].getTipo() == tipo) 
			{
				return i;
			}
		}
		return -1;
	}
	@Override
	public int getUnidadesTipoMoneda(double tipo) 
	{
		int posicion = posicionTipoMoneda(tipo);
		if(posicion == -1) 
		{
			return -1;
		}
		return bandejas[posicion].getCont();
	}
	@Override
	public boolean meterMonedas(double tipo, int unidades) 
	{
		int posicion = posicionTipoMoneda(tipo);
		if(posicion == -1) 
		{
			return false;
		}
		bandejas[posicion].meterUnidades(unidades);
		return true;
	}
	@Override
	public boolean monedaValida(double tipo) 
	{
		return posicionTipoMoneda(tipo) != -1;
	}
	@Override
	public boolean sacarMonedas(double tipo, int unidades) 
	{
		int posicion = posicionTipoMoneda(tipo);
		if(posicion == -1) 
		{
			return false;
		}
		bandejas[posicion].sacarUnidades(unidades);
		return true;
	}
	@Override
	public void vaciarCajaRegistradora() 
	{
		for (int i = 0; i < bandejas.length; i++)
		{
			bandejas[i].vaciar();
		}
	}
	@Override
	public double[] getTiposDeMoneda() 
	{
		
		return tipoMonedas;
		
	}
	
	
	
	
	
	
	
	
	
	private class Bandeja
	{
		private double tipo; //bandeja tipo 1, 2, 5 10, 20...
		private int cont; //contador de 
		
		public Bandeja(double tipo)
		{
			this.tipo=tipo;
			cont = 0;
		}
		
		public double getTipo() 
		{
			return tipo;
		}
		
		public int getCont() 
		{
			return cont;
		}
		
		public void meterUnidades(int unidades) 
		{
			cont += unidades;
		}
		
		public boolean sacarUnidades(int unidades) 
		{
			//Siempre tiene que hber mas dinero en la caja , cont, que el valor de un producto(unidades)
			if(unidades <= cont) 
			{
				cont -= unidades;
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public void vaciar() 
		{
			cont = 0;
		}
		
		public double getSaldo() 
		{
			return cont * tipo;
		}
		
	}









	
	}

package ejercicio62;

public class Conductor extends Empleado
{
	private double totalKms;
	private StringBuilder ciudadesRecorridas;
	
	public Conductor(String nom, String tel) 
	{
		super(nom, tel);
		totalKms = 0;
		ciudadesRecorridas = new StringBuilder();
	}
	
	/*void sumarKilometros (double kilometros) Suma kilometros a totalKilometros.
	◦ double getTotalKilometros( )
	◦ void pasaPorCiudad (String ciudad) Añade el nombre de la ciudad a las ciudades
	recorridas, permitiendo ciudades repetidas.
	◦ String[ ] getCiudadesRecorridas ( ) Devuelve un array con los nombres de las
	ciudades recorridas.*/
	
	public void sumarKilometros(double kms) 
	{
		totalKms += kms;
	}
	
	public double getTotalKilometros() 
	{
		return totalKms;
	}
	
	public void pasaPorCiudad(String ciudad) 
	{
		ciudadesRecorridas.append(ciudad + ",");
	}
	
	public String[] getCiudadesRecorridas() 
	{
		return ciudadesRecorridas.toString().split(",");
		//Split es un tabulador de ciudades, las separa
	}
}


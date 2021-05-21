package ejercicio62;

public class Main 
{
	public static void main(String[] args) 
	{
		Conductor conductor = new Conductor("Pepe","333222111");
		
		conductor.pasaPorCiudad("Malaga");
		conductor.pasaPorCiudad("Barcelona");
		
		String[] ciudades = conductor.getCiudadesRecorridas();
		
		for (int i = 0; i < ciudades.length; i++) 
		{
			System.out.println(ciudades[i] + " ,");
		}
		
		conductor.sumarKilometros(588.99);
		conductor.sumarKilometros(600.84);
		
		System.out.println(conductor.getTotalKilometros());
	}
}

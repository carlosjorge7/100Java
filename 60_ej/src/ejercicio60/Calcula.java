
/*60. Crea una clase llamada Calcula:
 * 
Implementa los siguientes métodos estáticos, que devolverán en cada caso el menor o
mayor número de los pasados como parámetros. En el caso de las cadenas devolverá
la de mayor o menor longitud.
◦ int mayor(int ... num )
◦ double mayor(double ... num)
◦ String mayor(String ... cadena)
◦ int menor(int ... num )
◦ double menor(double ... num)
◦ String menor(String ... cadena)
Crea una clase aparte con el método main para probar todas las funcionalidades de la
clase Calcula.*/

package ejercicio60;

public class Calcula 
{

	public Calcula() 
	{
		
	}
	
	public static double numMayor(double ... nums)
	{
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max;
	}

	public static int numMayor(int ... nums)
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] > max)
			
			{
				max = nums[i];
			}
		}
		return max;
	}
	
	public static double numMenor(double ... nums)
	{
		double min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
	}

	public static int numMenor(int ... nums)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
}
	
	public static String cadMayor(String ... strings) 
	{
		String mayor = "";
		/*String mayor = strings[0];*/ //estaoy indicando que el mayor se guarda en la primera poscion [0] del array de strings
		for (int i = 0; i < strings.length; i++) 
		{
			if(strings[i].length() > mayor.length()) 
			{
				mayor = strings[i];
			}
		}
		return mayor;
	}
	
	public static String cadMenor(String ... strings) 
	{
		String menor = "";
		/*String menor = strings[0];*/ //estaoy indicando que el menor se guarda en la primera poscion [0] del array de strings
		for (int i = 0; i < strings.length; i++) 
		{
			if(strings[i].length() < menor.length())//acuerdate de especificar el tamaño de la cadena con .length 
			{
				menor = strings[i];
			}
		}
		return menor;
	}
	
}

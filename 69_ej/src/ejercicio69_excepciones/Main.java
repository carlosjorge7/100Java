package ejercicio69_excepciones;
import java.util.Scanner;

import java.security.InvalidParameterException;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		final int NUM = 5;
		int[] numeros = new int[NUM];
		int pos = 0;
		int cont = 0;
		int divisor = 0;
		
		while(cont  < NUM) 
		{
			try 
			{
				System.out.println("Introduce una pos del array");
				pos = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce un divisor");
				divisor = Integer.parseInt(sc.nextLine());
				numeros[pos] = 5 / divisor;
				cont++;
			}
			//Excepcion de formato de numero
			catch(NumberFormatException e) 
			{
				System.out.println("no es un numero");
			}
			catch(ArithmeticException e) 
			{
				System.out.println("Division entre cero");
				//si divisor = 0, error
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Indice no valido");
				//si pos = -1, error
			}
			catch(Exception e) 
			{
				System.out.println("Excepcion indefinida");
			}
		}
		
		sc.close();
		System.out.println("El contenido del array numeros es");
		for(int valor : numeros)
			System.out.println(valor);
		//Excepcion de parametro no valido, creamos un objeto de este tipo y lo arroamos a la basura
		InvalidParameterException nullPointerException = new InvalidParameterException();
		throw nullPointerException;
	}
}

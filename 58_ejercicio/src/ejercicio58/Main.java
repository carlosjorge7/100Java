package ejercicio58;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Rectangulo rectangulo = new Rectangulo();
		
		rectangulo.agranda();
		
		System.out.println(rectangulo.getArea(2, 4));
		System.out.println(rectangulo.getPerimetro(2, 5));
		
		rectangulo.agranda(10);
		rectangulo.agranda(2,4);
		
	}
}

package generica;

public class Main 
{
	public static void main(String[] args) 
	{
		ClaseGenerica<Integer> claseGenerica1 = new ClaseGenerica<Integer>(1, 4);
		//Ya hemos establecido a y b, setA and setB
		
		claseGenerica1.intercambiarAB(); //No ponemos print porque es un void
		System.out.println(claseGenerica1.getA());
		System.out.println(claseGenerica1.getB());
		System.out.println(claseGenerica1.nombreClase());
		
		ClaseGenerica<String> claseGenerica2 = new ClaseGenerica<String>("Carlos", "Jorge");
		
		claseGenerica2.intercambiarAB();
		System.out.println(claseGenerica2.getA());
		System.out.println(claseGenerica2.getB());
		System.out.println(claseGenerica2.nombreClase());
		
	}
}

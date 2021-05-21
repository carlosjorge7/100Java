/*67.- Crea una clase (no final) llamada Demo que tenga dos métodos, uno de ellos final. Crea
una subclase que herede de Demo llamada SubDemo que sobreescriba el método que no es
final. Comprueba que el método final no puede ser sobreescrito en la subclase. Comprueba
además que el método de la subclase ha sido sobreescrito.*/


package ejercicio67;

public class Demo
{
	public Demo() {
		super();
	}
	//Este metodo no se puede heredar a una subclase
	public final void metodoFinal() {
		System.out.println("Soy un metodo final");
	}
	//Este metodo se podria heredar a una subclase
	public void metodoNoFinal() {
		System.out.println("Soy un metodo no final");
	}
}
 
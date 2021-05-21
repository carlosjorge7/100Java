package ejercicio67;

public class SubDemo extends Demo
{
	public SubDemo() {
		
	}
	
	public void metodoSubDemo() {
		System.out.println("hey, soy el metodo de SubDemo");
	}
	
	@Override //Para sobreescribir metodos, este metodo es el que hereda de la clase Demo
	
	public void metodoNoFinal() {
		System.out.println("hey, me han sobreescrito");
	}
}

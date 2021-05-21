package ejercicio67;

public class Main
{
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		demo.metodoFinal();
		demo.metodoNoFinal();
		
		SubDemo subDemo = new SubDemo();
		subDemo.metodoSubDemo();
		subDemo.metodoNoFinal(); /*Esta sentencia sobreescribe el metodoNoFinal de Demo(Soy un metodo no final)
		
						--!!  con el metodoNoFinal de SubDemo (Hey, me han sobreescrito)
		
								*/
		subDemo.metodoFinal();
		
	}
}

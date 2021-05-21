/*66.- Crea una clase final sencilla llamada Definitiva con dos atributos de tipo String con sus
getters y setters. OJO , una clase final es aquella clase que no tenga subclases*/

package ejercicio66;

final public class Definitiva
{
	private String a;
	private String b;
	
	public String getA() {
		return a;
	}
	
	public void setA(String a) {
		this.a=a;
	}
	
	public String getB() {
		return b;
	}
	
	public void setB(String b) {
		this.b=b;
	}
}

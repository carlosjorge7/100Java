package generica;

public class ClaseGenerica<T> 
{
	//T indica el Type
	private T a,b;
	
	public ClaseGenerica(T a, T b)
	{
		this.a=a;
		this.b=b;
	}
	
	public T getA() {
		return a;
	}
	
	public void setA(T a) {
		this.a=a;
	}
	
	public T getB() {
		return b;
	}
	
	public void setB(T b) {
		this.b=b;
	}
	
	public void intercambiarAB() {
		T aux;
		aux=a;
		a=b;
		b=aux;
	}
	
	public String nombreClase() {
		return a.getClass().getSimpleName();
	}
	
}

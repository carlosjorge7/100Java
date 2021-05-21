
package ejercicio75;

public class Almacen<T extends IComparador>
{
	//Vamos a guardar los n elementos en un Objeto tipo array y un cont para contar cuantos hay
	private Object[] elementos;
	private int cont;
	
	//El tamaño del array esta definido por el numMaximo de elemtos
	
	//cont lleva la cuenta de los elementos, mientras que elementos.length nos dice el n de elementos dentro del array
	
	public Almacen(int numMaximo) {
		
		elementos = new Object[numMaximo];
		cont = 0;
	}
	
	public int getCapacidad() {
		
		return elementos.length;
	}
	
	public int getNumeroElementos() {
		
		return cont;
	}
	
	

}

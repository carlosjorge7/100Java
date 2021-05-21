/*74.-
Crea una clase Utilidades con los siguientes métodos estáticos genéricos:

El siguiente método invertirá el orden de los elementos del array:
* public static <T> void alReves(T[] elementos)

El siguiente método mostrará por consola los elementos del array:
* public static <T> void muestraArray(T[] elementos)

El siguiente método inicializará el array del primer parámetro con el valor del
segundo parámetro.
* public static <T> void inicializa (T[] elementos, T elemento)

Crea una clase aparte con un método main que haga lo siguiente:
 Prueba los métodos con un array numérico y otro de tipo String.*/

package ejercicio74;

public class Utilidades<T> 
{
	
	
	public static <T> void alReves(T[] elementos) 
	{
		T aux;
		for (int i = 0; i < elementos.length; i++) {
			
			aux = elementos[i];
			elementos[i] = elementos[elementos.length -i -1]; //Acuerdate del 1 , para que no se salga
			elementos[elementos.length -i -1] = aux;
		}
	}
	
	public static <T> void muestraArray(T[] elementos) {
		
		for(T elemento : elementos) {
			
			System.out.println(elemento);
		}
	}
	
	public static <T> void inicializa (T[] elementos, T elemento) {
		
		for (int i = 0; i < elementos.length; i++) {
			
			elementos[i] = elemento;
		}
	}
}

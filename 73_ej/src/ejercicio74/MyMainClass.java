package ejercicio74;

public class MyMainClass
{
	public static void main(String[] args) {
		
		Integer[] numeros = {1, 2, 3, 4, 5};
		String[] cadenas = {"uno", "dos", "tres", "cuatro", "cinco"};
		
		Utilidades.alReves(numeros);
		Utilidades.alReves(cadenas);

		Utilidades.muestraArray(numeros);
		Utilidades.<String>muestraArray(cadenas);
		
		Utilidades.inicializa(numeros, 7);
		Utilidades.inicializa(cadenas, "hola");
		
		Utilidades.muestraArray(numeros);
		Utilidades.muestraArray(cadenas);
		
	}
}

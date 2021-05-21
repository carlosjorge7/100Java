
package ejercicio89;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio89
{

	public static void main(String[] args)
	{
		if(args.length != 3)
		{
			System.out.println("Número de argumentos incorrecto.");
			return;
		}

		File fLeer = new File(args[0]);

		if(fLeer.isFile()==false)
		{
			System.out.println("No es un fichero.");
			return;
		}

		try
		{
                        FileWriter fEscribir = new FileWriter(fLeer + ".new");
                        BufferedWriter myBuffer = new BufferedWriter(fEscribir);
			//BufferedWriter fEscribir = new BufferedWriter(new FileWriter(new File(args[0] + ".new")));
                        //Tiene que leer el fichero previamente para modificarlo
			Scanner sc = new Scanner(fLeer);
			while(sc.hasNextLine())
			{
				myBuffer.write(sc.nextLine().replaceAll(args[1], args[2]) + "\r\n");
			}
			sc.close();
			myBuffer.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Fichero no encontrado.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("Error al escribir.");
		}


	}

}
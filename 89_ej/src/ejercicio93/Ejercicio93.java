
package ejercicio93;

import java.io.File; //Para abrir el fichero
import java.io.FileWriter; //Para escribir el fichero
import java.io.BufferedWriter; //Para modificar el fichero
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Ejercicio93 
{
    public static void main(String[] args)
    {
          
        File file = new File("/home/carletes/Documentos/prueba.txt");
        
        int contLineas = 0;
        int contPalabras = 0;
        
        try{
           
            //Lo primero es leer el fichero de txt: Lo leemos con un Scanner
            Scanner sc = new Scanner(file);
            
            while(sc.hasNextLine()){
                /*Hacemos un acumulador por la siguiente razon:
                
                    * sc.nextLine interpreta cada linea del fichero, linea a linea
                    en el contPalabras vamos acumulando el numero de palabras que hay por linea
                    split para separar las palabras de la linea y length para contar dichas palabras
                    Primera it: pasa por la primera frase y acumulamos su valor
                    Segunda iteracion: pasa por la segunda frase y guardamos su valor
                    ... asi sucesivamente
                    
                    Si ponemos contPalabras = sc.nextLine().split(" ").length -- nos guarda el num de palabras de la ult frase
                    Recuerda que split(" ") separa la frase donde hay un espacio
                
                */
                contPalabras += sc.nextLine().split(" ").length;
                contLineas ++;
            }
            
            sc.close();
            FileWriter fileWriter = new FileWriter(file, true);
            
            BufferedWriter myBuffer = new BufferedWriter(fileWriter);   
            //Este ultimo para modificar el txt
            myBuffer.write("El numero de lineas de prueba.txt es" + contLineas);
            myBuffer.write("El numero de palabras de prueba.txt es" + contPalabras);
            myBuffer.close();
            
            //Se supone que el buffer modifica el fichero en si mismo, al abrir de nuevo prueba.txt ha de aparecer:
            //Las dos ultimas lineas del try
            
        }
        catch(FileNotFoundException e){
            System.out.print("Fichero no encontrado");
        }
        catch(IOException e){
            System.out.print("Error al escribir");
        }
    }
    
}

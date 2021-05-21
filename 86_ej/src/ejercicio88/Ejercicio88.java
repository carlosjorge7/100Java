
package ejercicio88;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Ejercicio88 {

    public static void main(String[] args) {
        
        /*Para leer el fichero desde consola con lin de comandos:
            archivo = args[0] (en esta variable especifico la ruta);
            */
        File archivo = new File("/home/carletes/Documentos/prueba.txt");
        
        if(archivo.isFile()==false){
            System.out.println("No es un fichero");
            return;
        }
        
        try{     
            
            Scanner sc = new Scanner(archivo);
            
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        
        }
        catch(FileNotFoundException e){
            System.out.print("No es un archivo");
        }
        
        
    }
    
}

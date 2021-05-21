
package ejercicio96;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ejercicio96 {

    
    public static void main(String[] args) 
    {
        
     
        File file = new File("/home/carletes/Documentos");
        
        //Distincion entre archivo: fichero o directorio
        File[] fils = file.listFiles();
        
        for(File fil : fils){
            
            if(fil.isDirectory()){
                explorarDirectorio(fil);
            }
            
            if(fil.isFile()){
                procesarFichero(fil);
            }
            
        }
    }
    
    private static void explorarDirectorio(File fil){
        
        //En caso de ser directorio, hacemos un array donde guardamos cada archivo del directorio
        
        File[] files = fil.listFiles();
        
        if(files != null){
            
            //Volvemos a recorrer los archivos
            for(File f: files){
                
                if(f.isFile()){
                    procesarFichero(f);
                }
                if(f.isDirectory()){
                    explorarDirectorio(f);
                }
            }
        }
    }
    
    private static void procesarFichero(File f){
        
        //File fil = new File("/home/carletes/Docuementos");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el String a buscar:");
        String buscar = leer.nextLine();
        
        try{
            
            Scanner sc = new Scanner(f);
            boolean existeCadena = false;
            while(sc.hasNextLine()){
                
                if(sc.nextLine().contains(buscar)){
                    existeCadena = true;
                    System.out.print(buscar + "esta contenido en el archivo");
                }
            }
            if(existeCadena == false){
                System.out.print(buscar + "no esta contenido en el archivo");
            }
         
            
          
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.print("Fichero no encontrado");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    
}

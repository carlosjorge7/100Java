
package ejercicio87;

import java.io.File;
import java.util.Scanner;

public class Ejercicio87
{   
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Escribe una ruta");
       String r = sc.nextLine();
       
       File ruta = new File(r); 
       
       //Guardamos cada archivo en un array, cada archivo una posicion
       File[] files = ruta.listFiles();
       
       for(File file : files){
           
           if(file.isDirectory()){
               
               System.out.println("Directorio" + file.getAbsolutePath());
               
           }
           else{
               System.out.println("Fichero" + file.getAbsolutePath());
           }
           
        }
        
        
        
        
        
        
    }
    
}

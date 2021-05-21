/*
Escribe un programa que lea un fichero de texto. El programa nos mostrará por cada palabra contenida en el
fichero el número de veces que aparece. Se mostrarán además ordenadas de mayor a menor
frecuencia de aparición.
 */
package pkg92_contar_palabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    
    public static void main(String[] args) {
        
        TreeMap<String, Integer> tmap = new TreeMap<>();
        
        try{
            Scanner sc = new Scanner(new File("/home/carletes/Documentos/contar-palabras.txt"));
            int cont = 0;
            String[] palabras;
            String linea;
            
            while(sc.hasNextLine()){
                
                linea = sc.nextLine();
                palabras = linea.split(" ");
                
                for (String palabra : palabras) {
                    
                    if(!tmap.containsKey(palabra)){
                        
                        tmap.put(palabra, 1);
                    }
                    else{
                        
                        cont = tmap.get(palabra);
                        cont++;
                        tmap.put(palabra, cont);
                    
                    }
                    
                }
                
            }
            
            for(String t : tmap.keySet()){
                System.out.println(t + tmap.get(t));
            }
            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.print("Error al leer el fichero");
            
        }
    }
    
}

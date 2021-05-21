/**
 * 95. Escribe un programa que ordene alfabéticamente las líneas de texto de un fichero pasado como parámetro.
Puede haber líneas repetidas.
**/
package pkg95_ordenaralfabeticamente;

import java.io.*;
import java.util.*;


public class Main {

    
    public static void main(String[] args) {
        
        TreeMap<String, Integer> tmap = new TreeMap<>();
        File file = new File("/home/carletes/Documentos/ordenar.txt");
        
        try{
            Scanner sc = new Scanner(new File("/home/carletes/Documentos/ordenar.txt"));
            String linea;
            int cont = 1;
            
            while(sc.hasNextLine()){
                
                linea = sc.nextLine();
                if(!tmap.containsKey(linea)){
                    
                    tmap.put(linea, cont);
                    cont++;
                }
            }
            
            BufferedWriter fEscribir = new BufferedWriter(new FileWriter(new File("/home/carletes/Documentos/ordenar.txt")));
            for(String lin : tmap.keySet()){
                
                fEscribir.write(lin + "\r\n");
            }
            fEscribir.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("error al escritura");
            
        }        
    }
    
}

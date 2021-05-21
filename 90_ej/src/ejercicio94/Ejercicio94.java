
package ejercicio94;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Ejercicio94 {
    
    public static void main(String[] args) {
        
        File f1 = new File("/home/carletes/Documentos/f1.txt");
        File f2 = new File("/home/carletes/Documentos/f2.txt");
        
        boolean sonIguales = true;
        int contLin = 0;
        
        try{
            //Leer los ficheros con la clase Scanner
            Scanner s1 = new Scanner(f1);
            Scanner s2 = new Scanner(f2);
            
            while(s1.hasNextLine() && s2.hasNextLine() && sonIguales == true){
                
                contLin++;
                //La idea es comparar linea a linea los dos ficheros
                if(s1.nextLine().equals(s2.nextLine()) == false){
                    
                    sonIguales = false; //En este caso se sale del while inmediatamente
                }
                else{
                    sonIguales = true;
                }
            } 
            
            if(sonIguales == false){
                
                System.out.print("Los dos ficheros son distintos a partir de la linea" + contLin);
            }
            else{
                System.out.print("Los dos ficheros son identicos");
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}

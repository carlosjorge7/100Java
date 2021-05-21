
package pkg102_no_comun;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;



public class Main {

    
    public static void main(String[] args) {
       
        ArrayList<String> array = new ArrayList<>();
        
        try{
            Scanner sc1 = new Scanner(new File("/home/carletes/Documentos/nocomun1.txt"));
            Scanner sc2 = new Scanner(new File("/home/carletes/Documentos/nocomun2.txt"));
           
            String linea2;
            int cont = 0;
            
            while(sc2.hasNextLine()){
               
                linea2 = sc2.nextLine();
                cont++;
            }
            String[] aux = new String[cont];
            
            String linea1;

            
            while(sc1.hasNextLine()){
                
                linea1 = sc1.nextLine();
                
                for (int i = 0; i < aux.length; i++) {
                    
                    if(!linea1.equals(aux[i])){
                        
                        array.add(linea1);
                    }  
                } 
            }
            
            System.out.print("Los elementos que no estan en comun son:"); 
            for(String arr : array){
                System.out.println(arr);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("error de fichero");
        }
    }
    
}

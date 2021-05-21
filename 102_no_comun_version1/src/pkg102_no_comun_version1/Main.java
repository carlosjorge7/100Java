
package pkg102_no_comun_version1;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        ArrayList<String> array3 = new ArrayList<>();
        
        try{
            Scanner sc1 = new Scanner(new File("/home/carletes/Documentos/nocomun1.txt"));
            Scanner sc2 = new Scanner(new File("/home/carletes/Documentos/nocomun2.txt"));
            
            while(sc1.hasNextLine()){
                
                String linea1 = sc1.nextLine();
                array1.add(linea1);
            }
            
            while(sc2.hasNextLine()){
                
                String linea2 = sc2.nextLine();
                array2.add(linea2);
            }
            
          
            for(String arr1 : array1){
                
                if(!array2.contains(arr1)){
                    
                    array3.add(arr1);
                }
            }
            
            for(String arr2 : array2){
                
                if(!array1.contains(arr2)){
                    
                    array3.add(arr2);
                }
            }
            
            for(String arr3 : array3){
                
                System.out.println(arr3);
            }
            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.printf("error al lectura");
        }
        
        
        
        
        
    }
    
}

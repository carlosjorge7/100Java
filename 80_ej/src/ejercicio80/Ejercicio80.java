package ejercicio80;

import java.util.TreeSet;
import java.util.Scanner;

public class Ejercicio80
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        TreeSet<Integer> numeros = new TreeSet<>();
        //Esta coleccion ORDENA elementos y los muestra los UNICOS
        
        System.out.println("Intro una serie de numeros");
        String[] nums = sc.nextLine().split(" ");
        
        //Hacemos este for para pasar los elementos del array al TreeSet
        for (String n : nums) {
           
            if(numeros.add(Integer.parseInt(n))){
                
                System.out.println("El numero se ha añadido con exito");
            }
            else{
                //Si no podemos añadirlo al TreeSet , significa que esta repetido, ya que el TreeSet muestra los no repetidos
                System.out.println("El numero" + n + "esta repetido");
            }
        }
        muestraTreeSet(numeros);    
    }
    //Este for es para recorrer el TreeSet una vez echas las transformaciones
    private static void muestraTreeSet(TreeSet<Integer> numeros){
        for(Integer num : numeros){
            System.out.println(num);
        } 
        
    }
    
}

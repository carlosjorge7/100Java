/*
7.- Programa que pide el número de calificaciones decimales a introducir,
y una nota de corte. A continuación se
introducirán las calificaciones, para finalmente 
indicar cuántas calificaciones han igualado o superado la nota de
corte.
 */
package pkg7_ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Numero de calificaciones:");
        int numCalif = sc.nextInt();
        System.out.println("Nota de corte:");
        float notaCorte = sc.nextFloat();
        
        int cont = 0;
        
        for (int i = 0; i < numCalif; i++) {
            
            System.out.println("Nota:");
            float calificacion = sc.nextFloat();
            //<>
            if(calificacion >= notaCorte){
                cont++;
            }
            
        }
        System.out.println("Numero de notas mayores o iguales a" 
        + "NOTA_DE_CORTE=" + notaCorte + "TOTAL="+cont);      
    }
}


package ejercicio82;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio82
{
    public static void main(String[] args)
    {
        TreeMap<Integer, Alumno> alumnos = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        
        int exp;
        String nom;
        int nota;
        int evaluacion;
        Alumno alumno;
        
        String op = "0";
        
        while(!op.equals("6")){
            
            System.out.println("1 - Introducir alumno");
            System.out.println("2 - Listar alumnos");
            System.out.println("3 - Introducir nota del alumno");
            System.out.println("4 - Eliminar alumno");
            System.out.println("5 - Eliminar todos");
            System.out.println("6 - Salir");
            
            System.out.println("Elige una de las opciones");
            op = sc.nextLine();
            
            switch(op){
                
                case "1": //Introducir un alumno
                    System.out.println("Introduce el expediente del alumno");
                    exp = Integer.parseInt(sc.nextLine());
                   
                    if(alumnos.containsKey(exp)){
                       System.out.println("Expediente repetido");
                    }
                    else{
                           
                           System.out.println("Introduce el nombre del alumno");
                           nom = sc.nextLine();
                           alumnos.put(exp, new Alumno(nom));
                    }
                    break;
                case "2": //Listar alumnos
                    
                    for(Integer e : alumnos.keySet()){
                        alumno = alumnos.get(e); //Guarda el valor del expediente, en este caso Alumno
                        
                        System.out.print("Expediente:" + e + "Nombre:" + alumno.getNom() + "Notas:" +
                                formateaNota(alumno.getN1()) + formateaNota(alumno.getN2()) + formateaNota(alumno.getN3())  );
                    }
                    break;
                    
                case "3": //Introducir nota
                    System.out.print("Introduce expediente:");
                    exp = Integer.parseInt(sc.nextLine());
                    
                    if(alumnos.containsKey(exp)){
                        
                        System.out.print("Evaluacion(1, 2 , 3):");
                        evaluacion = Integer.parseInt(sc.nextLine());
                        if(evaluacion >= 1 && evaluacion <= 3){
                            
                            System.out.print("Nota:");
                            nota = sc.nextInt();
                            if(nota >= 0 && nota <= 10){
                                alumno = alumnos.get(exp); //Valor de la clave .. nom
                                alumno.setNotas(evaluacion, nota);
                            }
                            else{
                                System.out.print("Nota fuera de rango");
                            }
                        }
                        else{
                            System.out.print("Evaluacion fuera de rango");
                        }
                    }
                    else{
                        System.out.print("El alumno no existe");
                    }
                    break;
                    
                    
                case "4": //Eliminar alumno
                    System.out.print("Introduce expediente:");
                    exp = Integer.parseInt(sc.nextLine());
                    if(alumnos.containsKey(exp)){
                        alumnos.remove(exp);
                    }
                    else{
                        System.out.print("El alumno no existe");
                    }
                    
            
                    
                    break;
                case "5": //Borrar todos
                    
                    alumnos.clear();
                    
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                
            }
        }
    }
    
    private static String formateaNota(int nota){
        
		return nota == -1 ? "-" : nota + "";
    }
    
}

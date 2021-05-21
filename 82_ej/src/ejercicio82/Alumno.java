
package ejercicio82;


public class Alumno
{
    private String nom;
    private int n1, n2, n3;
    
    //La idea es crear un constructor que te pida solo el nom,
    
    private static int SIN_NOTA = -1;
    
    public Alumno(String nom, int nota){
        this.nom=nom;
        n1=SIN_NOTA;
        n2=SIN_NOTA;
        n3=SIN_NOTA;
        
        
    }
    
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    
    public void setNotas(int evaluacion, int nota){
        
        if(nota >= 0 && nota <= 10){
            
            if(evaluacion == 1){
                n1 = nota;
            }
            else if(evaluacion == 2){
                n2 = nota;
            }
            else if(evaluacion == 3){
                n3 = nota;
            }
        }
    }
    
    public int getN1(){
        return n1;
    }
    
    public int getN2(){
        return n2;
    }
    
    public int getN3(){
        return n3;
    }
}

/**
 53.- Crea una clase llamada Nombres, capaz de gestionar una lista de nombres, sin repetir, de
un tamaño determinado:
El constructor recibirá como parámetro el número máximo de nombres que albergará.
Tendrá los siguientes métodos:

* boolean anadir(String nombre) Añade a la lista el nombre pasado como
parámetro. Devuelve false si la lista está llena o si ya existe el nombre, true si
se añade con éxito. No admite repetidos.

* boolean eliminar(String nombre) Elimina de la lista el nombre pasado como
parámetro. Devuelve true en caso de éxito y false si no encuentra el nombre a
eliminar.

* void vaciar() Elimina todos los nombres de la lista.

* String getNombre(int posicion) Devuelve el nombre que se encuentra en la
posición pasada como parámetro (la primera es la posición 0). Devuelve null si
no es una posición válida.

* int getNumeroNombres() Devuelve el número de nombres que hay
actualmente.

* int getCapacidad() Devuelve el número máximo de nombres que puede
albergar.

* boolean estaLlena() Devuelve true si la lista está llena y false en caso
contrario.

* boolean buscarNombre(String nombre) Devuelve true si encuentra el
nombre, false en caso contrario.
 **/
package pkg53_nombres;


public class Nombres {
    
    private String[] nombres;
    private int cont; //Aguja, para guardar nombres y contar nombres
   
    public Nombres(int tamano){
        
        nombres = new String[tamano];
    }
    
    public boolean anadirNombre(String nombre){
        
        if(nombres.length == cont){
            
            return false;
        }
        
        for (int i = 0; i < cont; i++) {
            
            if(nombres[i].equalsIgnoreCase(nombre)){
                
               return false;
            }
        }
        nombres[cont] = nombre;
        cont++;
        return true;
        
    }
    
    public boolean eliminarNombre(String nombre){
        
        boolean encontrado = false;
        int iEliminar = -1;
        
        for (int i = 0; i < cont; i++) {
            
            if(nombres[i].contains(nombre)){
         
                encontrado = true;
                iEliminar = i;
            }
        }    
        if(encontrado){
            
           for (int i = iEliminar; i < cont - 1; i++){
                
		nombres[i] = nombres[i + 1];
            }
            cont--;
	}
        return encontrado;
            
        
        
    }
    
    public void vaciar(){
        
        cont = 0;
    }
    
    public String getNombre(int pos){
        
        if(pos >= 0 && pos < cont){
            
            return nombres[pos];
        }
        else{
            return null;
        }
        
    }
    
    public int getNumeroNombres(){
        
        return cont;
    }
    
    public int getCapacidad(){
        
        return nombres.length;
    }
    
    public boolean estaLlena(){
        
        if(cont == nombres.length){
            
            return true;
        }
        return false;
    }
    
    public boolean buscarNombe(String nombre){
        
        for (int i = 0; i < cont; i++) {
            
            if(nombres[i].contains(nombre)){
                
                return true;
            }
        }
        return false;
    }
    
    
    
}

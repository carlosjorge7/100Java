/**
55.- Crea una clase llamada Empleado:
Con los atributos privados nombre, y teléfono, de tipo String.
El constructor necesitará el nombre y el teléfono.
Implementa los métodos necesarios para acceder a estos dos atributos de manera pública
(getters y setters).
* Añade el atributo estático y privado numeroEmpleados. Este atributo almacenará el número de
instancias que se han creado de la clase Empleado
* Implementa un método público para conocer el valor de numeroEmpleados. Llámalo
getNumeroEmpleados.

Crea una clase aparte con el método main:

Crea un array de 4 empleados. Los datos de cada empleado será leidos por consola.

Muestra los datos de cada empleado del array.

Llama al método getNumeroEmpleados para mostrar el número de empleados
instanciados.
 **/
package pkg55_empleados;


public class Empleado {
    
    private String nombre;
    private String telefono;
    
    private static int numEmpleados = 0;
    
    public Empleado(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        numEmpleados++;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public int getNumEmpleados(){
        return numEmpleados;
    }
    
}

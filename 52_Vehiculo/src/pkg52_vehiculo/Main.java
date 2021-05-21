
package pkg52_vehiculo;


public class Main {

    
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo(4, 200, 100, 2000); //Coche
        Vehiculo vehiculo2 = new Vehiculo(2, 210, 120, 700); //Moto
        
        //vehiculo1.copiaVehiculo(vehiculo2); //Los att de moto se los paso a coche
        
        if(vehiculo1.esIgual(vehiculo2) == true){
            
            System.out.print("Son identicos");
        }
        else{
            
            System.out.print("son distintos");
        }
    
        vehiculo1.copiaVehiculo(vehiculo2); //Los att de moto se los paso a coche
        
        
        
    }
}

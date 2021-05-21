/**
52.- Crea una clase llamada Vehículo: Con los atributos privados numeroRuedas, velocidadMaxima, velocidadActual y peso
* Implementa los métodos necesarios para acceder a estos atributos de manera pública
(getters y setters).
* La clase dispondrá de un constructor que necesitará como parámetros los valores
iniciales para todos sus atributos.
* Crea un método público que devuelva boolean, llamado esIgual(Vehiculo vehiculo) que
sirva para comparar dos vehículos, de manera que devuelva true o false dependiendo
de si son iguales o no (se consideran iguales si el valor de todos sus atributos es el
mismo). El método recibirá como argumento un objeto de la clase Vehículo.
* Crea un método público que devuelva void llamado copia(Vehiculo vehiculo) que
copiará los atributos de un vehículo en otro. El método recibirá como parámetro un
objeto de la clase Vehículo del cual se copiarán sus valores.
* Crea una clase aparte con el método main para probar las funcionalidades de la clase Vehículo.
 **/
package pkg52_vehiculo;


public class Vehiculo {
    
    private int numeroRuedas;
    private int velocidadMaxima;
    private int velocidadActual;
    private int peso;

    public Vehiculo(int numeroRuedas, int velocidadMaxima, int velocidadActual, int peso) {
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.peso = peso;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }
    
    public void setNumeroRuedas(int numeroRuedad) {
       this.numeroRuedas = numeroRuedad;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }
    
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public boolean esIgual(Vehiculo vehiculo){
        
        if(vehiculo.getNumeroRuedas() == numeroRuedas && vehiculo.getVelocidadMaxima() == velocidadMaxima
                && vehiculo.getVelocidadActual() == velocidadActual && vehiculo.getPeso() == peso){
            
            return true;
        }
        return false;
    }
    
    public void copiaVehiculo(Vehiculo vehiculo){
        
        numeroRuedas = vehiculo.getNumeroRuedas(); //getNumRuedad de vehiculo y copialo en el att numero de Ruedas
        velocidadMaxima = vehiculo.getVelocidadMaxima();
        velocidadActual = vehiculo.getVelocidadActual();
        peso = vehiculo.getPeso();
    }
    
    
}

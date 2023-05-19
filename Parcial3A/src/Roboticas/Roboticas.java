package Roboticas;
public class Roboticas implements Naves, RoboticasI, Lanzaderas.Naves{
    
    public void despegar() {
        System.out.println("Nave robotica despegando");
    }
    
    
    public void aterrizar() {
        System.out.println("Nave robotica aterrizando");
    }
    
    
    public void viajar() {
        System.out.println("Nave robotica viajando");
        
        
}
    public void informar() {
    	System.out.println("Nave robotica informando"); 
    }
}
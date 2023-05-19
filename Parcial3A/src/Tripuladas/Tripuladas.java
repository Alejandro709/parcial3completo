package Tripuladas;

public class Tripuladas implements Naves, TripuladasI, Lanzaderas.Naves {
	
	public void despegar() {
			
        System.out.println("Nave tripulada despegando");
    }
    
    
    public void aterrizar() {
        System.out.println("Nave tripulada  aterrizando");
    }
    
    
    public void viajar() {
        System.out.println("Nave tripulada viajando");
                     
}
    public void controladas() {
    	System.out.println("Nave tripulada controlada");
    }

}
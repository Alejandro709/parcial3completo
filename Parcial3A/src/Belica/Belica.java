package Belica;

public class Belica implements Naves, BelicaI, Lanzaderas.Naves {
	public void despegar() {
        System.out.println("Nave belica despegando");
    }
    
    
    public void aterrizar() {
        System.out.println("Nave belica aterrizando");
    }
    
    
    public void viajar() {
        System.out.println("Nave belica viajando");
    }
        
        public void disparar() {
        	System.out.println("Nave belica dispara");
        }

}

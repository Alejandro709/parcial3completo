package Main;

import java.util.Scanner;

import Belica.Belica;
import Lanzaderas.Lanzadera;
import Lanzaderas.Naves;
import Roboticas.Roboticas;
import Tripuladas.Tripuladas;
public class Main implements Naves {
    public static void main(String[] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("¿Deseas crear una nave espacial? (true/false)");
			boolean crearNave = scanner.nextBoolean();

			if (crearNave) {
			    System.out.println("Selecciona el tipo de nave a crear:");
			    System.out.println("1. Belica");
			    System.out.println("2. Lanzadera");
			    System.out.println("3. Roboticas");
			    System.out.println("4. Tripuladas");

			    int opcion = scanner.nextInt();

			    Naves nave;

			    switch (opcion) {
			        case 1:
			            nave =  new Belica();
			            break;
			        case 2:
			            nave = new Lanzadera();
			            break;
			        case 3:
			        	 nave = new Roboticas();
			             break;
			        case 4: 
			        	 nave =  new Tripuladas();
			             break;
			        default:
			            System.out.println("Opción inválida. No se creará ninguna nave.");
			            return;
			    }

			   
			    nave.despegar();
			    nave.aterrizar();
			    
			} else {
			    System.out.println("No se creará ninguna nave.");
			}
			System.out.println("¿Deseas terminar el programa? (true/false)");
            scanner.nextBoolean();
        
        }
        
    }

	
	public void despegar() {
		
	
	}

	
	public void aterrizar() {
		
		
	}

	
	public void viajar() {
		
		
	}

	
	public void disparar() {
		
		
	}

	
	public void desacoplar() {
		
	}

	
	public void controladas() {
		
		
	}


	public void informar() {
		
		
	}
	


}

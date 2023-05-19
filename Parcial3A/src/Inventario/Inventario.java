package Inventario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Belica.Belica;
import Lanzaderas.Lanzadera;
import Lanzaderas.Naves;
import Roboticas.Roboticas;
import Tripuladas.Tripuladas;

public class Inventario {
    private List<Naves> inventario;

    public void NaveInventory() {
        inventario = new ArrayList<>();
    }

    public void agregarNave(Naves nave) {
        inventario.add(nave);
    }

    public void buscarNave(String tipo) {
        List<Naves> navesEncontradas = new ArrayList<>();

        for (Naves nave : inventario) {
            if (nave.getClass().getSimpleName().equals(tipo)) {
                navesEncontradas.add(nave);
            }
        }

        if (navesEncontradas.isEmpty()) {
            System.out.println("No se encontraron naves del tipo " + tipo);
        } else {
            System.out.println("Se encontraron las siguientes naves del tipo " + tipo + ":");
            for (Naves nave : navesEncontradas) {
                System.out.println(nave.getClass().getSimpleName());
            }
        }
    }

    public static void main(String[] args) {
       Inventario inventario = new Inventario();

      
        for (int i = 0; i < 4; i++) {
            inventario.agregarNave(new  Belica());
            inventario.agregarNave((Naves) new Lanzadera());
            inventario.agregarNave((Naves) new Roboticas ());
            inventario.agregarNave((Naves) new Tripuladas());
        }


        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el tipo de nave a buscar:");
			String tipoNave = scanner.nextLine();
			inventario.buscarNave(tipoNave);
		}
    }
}
package edu.dosw.bootcamp.lab;

import edu.dosw.bootcamp.lab.comportamiento.reto4.Reto4CasaDeCambio;
import edu.dosw.bootcamp.lab.comportamiento.reto6.Reto6SoporteTecnico;
import edu.dosw.bootcamp.lab.comportamiento.reto7.Reto7ControlRemoto;
import edu.dosw.bootcamp.lab.creacionales.reto2.Reto2ChefEstrellas;
import edu.dosw.bootcamp.lab.creacionales.reto3.Reto3ReinoVehiculos;
import edu.dosw.bootcamp.lab.estructurales.reto5.Reto5CafePersonalizado;
import edu.dosw.bootcamp.lab.solid.reto1.Reto1TiendaDonPepe;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proyecto Maven configurado y corriendo correctamente");
        System.out.println("\n¿Qué reto desea ejecutar?");
        System.out.println("1. Tienda Don Pepe");
        System.out.println("2. Chef de 5 Estrellas");
        System.out.println("3. Reino de los Vehículos");
        System.out.println("4. Casa de Cambio");
        System.out.println("5. Café Personalizado");
        System.out.println("6. Soporte Técnico");
        System.out.println("7. Control Remoto");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1": Reto1TiendaDonPepe.ejecutar(); break;
            case "2": Reto2ChefEstrellas.ejecutar(); break;
            case "3": Reto3ReinoVehiculos.ejecutar(); break;
            case "4": Reto4CasaDeCambio.ejecutar(); break;
            case "5": Reto5CafePersonalizado.ejecutar(); break;
            case "6": Reto6SoporteTecnico.ejecutar(); break;
            case "7": Reto7ControlRemoto.ejecutar(); break;
            default: System.out.println("no válida.");
        }

        scanner.close();
    }
}
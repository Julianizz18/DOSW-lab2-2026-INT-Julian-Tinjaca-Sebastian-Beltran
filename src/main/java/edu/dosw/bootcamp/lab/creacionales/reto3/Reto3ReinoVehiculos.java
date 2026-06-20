package edu.dosw.bootcamp.lab.creacionales.reto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto3ReinoVehiculos {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        List<Vehiculo> compra = new ArrayList<>();

        System.out.println("Bienvenido al Reino de los Vehiculos");
        System.out.println("Tierra: Auto, Bicicleta, Moto");
        System.out.println("Acuatico: Lancha, Velero, Jet Ski");
        System.out.println("Aereo: Avion, Avioneta, Helicoptero");
        System.out.println("Categorias: economico, lujo, usado");

        System.out.print("\n¿Cuantos vehiculos desea comprar? ");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 1; i <= n; i++) {
            Vehiculo v = null;
            while (v == null) {
                System.out.printf("\nVehiculo %d:%n", i);
                System.out.print("  Tipo (tierra/acuatico/aereo): ");
                String tipo = sc.nextLine().trim().toLowerCase();

                System.out.print("  Modelo: ");
                String modelo = sc.nextLine().trim();

                System.out.print("  Categoria (economico/lujo/usado): ");
                String categoria = sc.nextLine().trim();

                try {
                    FabricaVehiculos fabrica = switch (tipo) {
                        case "tierra"   -> new FabricaTierra();
                        case "acuatico" -> new FabricaAcuatica();
                        case "aereo"    -> new FabricaAerea();
                        default -> throw new IllegalArgumentException("Tipo no valido: " + tipo);
                    };
                    v = fabrica.crearVehiculo(modelo, categoria);
                } catch (IllegalArgumentException e) {
                    System.out.println("  Error: " + e.getMessage() + ". Intente de nuevo.");
                }
            }
            compra.add(v);
        }

        System.out.println();
        for (int i = 0; i < compra.size(); i++) {
            System.out.printf("Vehiculo %d: %s %s%n", i + 1, compra.get(i).getModelo(), compra.get(i).getCategoria());
            System.out.printf("  Vel. max: %.0f km/h%n", compra.get(i).getVelocidadMaxima());
            System.out.printf("  Precio: $%,.0f%n", compra.get(i).getPrecio());
        }

        double total = compra.stream().mapToDouble(Vehiculo::getPrecio).sum();
        System.out.printf("%nTotal a pagar: $%,.0f%n", total);
        System.out.println("¡Gracias por su compra!");
    }
}

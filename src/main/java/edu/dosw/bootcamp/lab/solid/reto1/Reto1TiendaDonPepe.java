package edu.dosw.bootcamp.lab.solid.reto1;

import java.util.Scanner;

public class Reto1TiendaDonPepe {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda Don Pepe");
        System.out.println("Tipo de cliente (Nuevo / Frecuente): ");
        String tipo = scanner.nextLine();

        Cliente cliente = new Cliente("Cliente", tipo);
        System.out.println("Cliente: " + cliente.getTipo());

        Producto camiseta = new Producto("Camiseta", 700000);
        Producto pantalon = new Producto("Pantalon", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        System.out.println("\nProductos disponibles:");
        System.out.println("1. Camiseta     700000");
        System.out.println("2. Pantalon     50000");
        System.out.println("3. Galletas     500");
        System.out.println("4. Jugo Natural 3000");

        Carrito carrito = new Carrito();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nQué producto deseas agregar si no quieres nada 0: ");
            String opcion = scanner.nextLine();

            Producto producto = null;
            switch (opcion) {
                case "1": producto = camiseta; break;
                case "2": producto = pantalon; break;
                case "3": producto = galletas; break;
                case "4": producto = jugo; break;
                case "0": continuar = false; continue;
                default: System.out.println("Opción no válida."); continue;
            }

            System.out.println("¿Cuántas?: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            carrito.agregar(producto, cantidad);
        }

        carrito.generarRecibo(cliente);
        scanner.close();
    }
}
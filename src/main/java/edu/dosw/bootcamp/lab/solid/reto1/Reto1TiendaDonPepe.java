package edu.dosw.bootcamp.lab.solid.reto1;

public class Reto1TiendaDonPepe {

    public static void ejecutar() {
        System.out.println("¡Bienvenido a la tienda Don Pepe!");

        Cliente cliente = new Cliente("Juan", "Frecuente");
        System.out.println("Cliente: " + cliente.getTipo());

        Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalón", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        System.out.println("\nProductos disponibles:");
        System.out.println("  Camiseta     $20.000");
        System.out.println("  Pantalón     $50.000");
        System.out.println("  Galletas     $500");
        System.out.println("  Jugo Natural $3.000");

        System.out.println("\nIngrese su compra:");
        System.out.println("  Camiseta:    2 unidades");
        System.out.println("  Galletas:    3 unidades");
        System.out.println("  Jugo Natural: 5 unidades");

        Carrito carrito = new Carrito();
        carrito.agregar(camiseta, 2);
        carrito.agregar(galletas, 3);
        carrito.agregar(jugo, 5);

        carrito.generarRecibo(cliente);
    }
}
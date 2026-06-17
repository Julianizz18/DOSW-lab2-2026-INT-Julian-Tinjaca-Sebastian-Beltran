package edu.dosw.bootcamp.lab.solid.reto1;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private final List<Producto> productos = new ArrayList<>();
    private final List<Integer> cantidades = new ArrayList<>();

    public void agregar(Producto producto, int cantidad) {
        productos.add(producto);
        cantidades.add(cantidad);
        System.out.println(producto.getNombre() + ": " + cantidad + " unidades agregadas al carrito.");
    }

    public void generarRecibo(Cliente cliente) {
        double subtotal = 0;

        System.out.println("\n RECIBO DE COMPRA ");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Productos:");

        for (int i = 0; i < productos.size(); i++) {
            double total = productos.get(i).getPrecio() * cantidades.get(i);
            subtotal += total;
            System.out.println("  " + productos.get(i).getNombre() + " - $" + (int)total);
        }

        double descuento = cliente.aplicarDescuento(subtotal);
        double total = subtotal - descuento;
        int porcentaje = cliente.getTipo().equalsIgnoreCase("Frecuente") ? 10 : 5;

        System.out.println("Subtotal: $" + (int)subtotal);
        System.out.println("Descuento (" + porcentaje + "%): $" + (int)descuento);
        System.out.println("Total a pagar: $" + (int)total);
        System.out.println("¡Gracias por su compra!");
    }
}
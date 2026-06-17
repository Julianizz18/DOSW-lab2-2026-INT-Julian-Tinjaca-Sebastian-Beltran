package edu.dosw.bootcamp.lab.solid.reto1;

public class Cliente {
    private final String nombre;
    private final String tipo;

    public Cliente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }

    public double aplicarDescuento(double subtotal) {
        if (tipo.equalsIgnoreCase("Frecuente")) {
            return subtotal * 0.10;
        } else {
            return subtotal * 0.05;
        }
    }

    public String getTipo() {
        return tipo;
    }
}
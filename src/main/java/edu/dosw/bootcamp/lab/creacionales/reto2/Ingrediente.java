package edu.dosw.bootcamp.lab.creacionales.reto2;

public class Ingrediente {
    private final String nombre;
    private final double precio;

    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}
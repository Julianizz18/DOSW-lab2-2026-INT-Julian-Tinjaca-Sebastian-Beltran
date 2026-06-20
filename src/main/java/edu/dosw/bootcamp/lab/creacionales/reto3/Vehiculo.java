package edu.dosw.bootcamp.lab.creacionales.reto3;

public abstract class Vehiculo {
    protected String modelo;
    protected String categoria;
    protected double velocidadMaxima;
    protected double precio;

    public String getModelo() { return modelo; }
    public String getCategoria() { return categoria; }
    public double getVelocidadMaxima() { return velocidadMaxima; }
    public double getPrecio() { return precio; }
}

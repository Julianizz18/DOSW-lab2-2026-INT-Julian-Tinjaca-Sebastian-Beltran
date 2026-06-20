package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Avioneta extends Vehiculo {
    public Avioneta(String categoria) {
        this.modelo = "Avioneta";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 200; this.precio = 80_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 350; this.precio = 300_000_000; }
            case "usado"     -> { this.velocidadMaxima = 180; this.precio = 40_000_000; }
        }
    }
}

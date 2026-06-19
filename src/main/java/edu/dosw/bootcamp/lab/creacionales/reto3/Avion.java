package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Avion extends Vehiculo {
    public Avion(String categoria) {
        this.modelo = "Avion";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 700; this.precio = 500_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 900; this.precio = 2_000_000_000; }
            case "usado"     -> { this.velocidadMaxima = 600; this.precio = 200_000_000; }
        }
    }
}

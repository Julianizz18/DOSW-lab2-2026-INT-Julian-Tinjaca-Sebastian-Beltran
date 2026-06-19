package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Moto extends Vehiculo {
    public Moto(String categoria) {
        this.modelo = "Moto";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 160; this.precio = 12_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 220; this.precio = 45_000_000; }
            case "usado"     -> { this.velocidadMaxima = 130; this.precio = 6_000_000; }
        }
    }
}

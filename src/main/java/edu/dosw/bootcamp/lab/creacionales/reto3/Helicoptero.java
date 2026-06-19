package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Helicoptero extends Vehiculo {
    public Helicoptero(String categoria) {
        this.modelo = "Helicoptero";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 180; this.precio = 320_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 280; this.precio = 900_000_000; }
            case "usado"     -> { this.velocidadMaxima = 150; this.precio = 120_000_000; }
        }
    }
}

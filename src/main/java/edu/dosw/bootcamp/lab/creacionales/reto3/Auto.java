package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Auto extends Vehiculo {
    public Auto(String categoria) {
        this.modelo = "Auto";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 140; this.precio = 35_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 250; this.precio = 120_000_000; }
            case "usado"     -> { this.velocidadMaxima = 120; this.precio = 18_000_000; }
        }
    }
}

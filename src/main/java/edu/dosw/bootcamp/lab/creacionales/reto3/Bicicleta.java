package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Bicicleta extends Vehiculo {
    public Bicicleta(String categoria) {
        this.modelo = "Bicicleta";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 25; this.precio = 500_000; }
            case "lujo"      -> { this.velocidadMaxima = 50; this.precio = 8_000_000; }
            case "usado"     -> { this.velocidadMaxima = 20; this.precio = 200_000; }
        }
    }
}

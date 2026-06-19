package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Lancha extends Vehiculo {
    public Lancha(String categoria) {
        this.modelo = "Lancha";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 60;  this.precio = 25_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 120; this.precio = 90_000_000; }
            case "usado"     -> { this.velocidadMaxima = 50;  this.precio = 12_000_000; }
        }
    }
}

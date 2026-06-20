package edu.dosw.bootcamp.lab.creacionales.reto3;

public class JetSki extends Vehiculo {
    public JetSki(String categoria) {
        this.modelo = "Jet Ski";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 80;  this.precio = 15_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 130; this.precio = 50_000_000; }
            case "usado"     -> { this.velocidadMaxima = 70;  this.precio = 8_000_000; }
        }
    }
}

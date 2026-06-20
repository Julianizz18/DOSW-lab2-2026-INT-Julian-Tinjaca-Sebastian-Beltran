package edu.dosw.bootcamp.lab.creacionales.reto3;

public class Velero extends Vehiculo {
    public Velero(String categoria) {
        this.modelo = "Velero";
        this.categoria = categoria;
        switch (categoria.toLowerCase()) {
            case "economico" -> { this.velocidadMaxima = 30;  this.precio = 40_000_000; }
            case "lujo"      -> { this.velocidadMaxima = 60;  this.precio = 150_000_000; }
            case "usado"     -> { this.velocidadMaxima = 25;  this.precio = 20_000_000; }
        }
    }
}

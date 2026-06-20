package edu.dosw.bootcamp.lab.estructurales.reto5;

public class CafeBase implements Cafe {
    @Override
    public String getDescripcion() {
        return "Espresso";
    }

    @Override
    public double getPrecio() {
        return 89500;
    }
}
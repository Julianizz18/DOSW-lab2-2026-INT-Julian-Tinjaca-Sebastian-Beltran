package edu.dosw.bootcamp.lab.comportamiento.reto4;

public class CasaDeCambio {
    private ConversionStrategy strategy;

    public void setStrategy(ConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public double convertir(double monto) {
        return strategy.convertir(monto);
    }

    public String getDescripcion() {
        return strategy.getDescripcion();
    }
}
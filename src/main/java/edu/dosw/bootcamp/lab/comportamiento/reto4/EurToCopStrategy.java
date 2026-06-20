package edu.dosw.bootcamp.lab.comportamiento.reto4;

public class EurToCopStrategy implements ConversionStrategy {
    private static final double TASA_EUR_COP = 4013.0;

    @Override
    public double convertir(double monto) {
        return monto * TASA_EUR_COP;
    }

    @Override
    public String getDescripcion() {
        return "EUR to COP";
    }
}
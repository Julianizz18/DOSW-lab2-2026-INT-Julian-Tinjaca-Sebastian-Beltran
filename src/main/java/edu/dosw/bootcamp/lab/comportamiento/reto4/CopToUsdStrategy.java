package edu.dosw.bootcamp.lab.comportamiento.reto4;

public class CopToUsdStrategy implements ConversionStrategy {
    private static final double TASA = 3.433;

    @Override
    public double convertir(double monto) {
        return monto / TASA;
    }

    @Override
    public String getDescripcion() {
        return "COP to USD";
    }
}
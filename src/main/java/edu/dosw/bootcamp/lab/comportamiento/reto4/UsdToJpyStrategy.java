package edu.dosw.bootcamp.lab.comportamiento.reto4;

public class UsdToJpyStrategy implements ConversionStrategy {
    private static final double TASA = 161.29;

    @Override
    public double convertir(double monto) {
        return monto * TASA;
    }

    @Override
    public String getDescripcion() {
        return "USD to JPY";
    }
}
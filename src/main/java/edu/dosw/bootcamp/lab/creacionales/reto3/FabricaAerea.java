package edu.dosw.bootcamp.lab.creacionales.reto3;

public class FabricaAerea implements FabricaVehiculos {
    @Override
    public Vehiculo crearVehiculo(String modelo, String categoria) {
        return switch (modelo.toLowerCase()) {
            case "avion"       -> new Avion(categoria);
            case "avioneta"    -> new Avioneta(categoria);
            case "helicoptero" -> new Helicoptero(categoria);
            default -> throw new IllegalArgumentException("Modelo no valido: " + modelo);
        };
    }
}

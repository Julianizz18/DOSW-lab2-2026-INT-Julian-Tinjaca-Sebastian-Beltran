package edu.dosw.bootcamp.lab.creacionales.reto3;

public class FabricaTierra implements FabricaVehiculos {
    @Override
    public Vehiculo crearVehiculo(String modelo, String categoria) {
        return switch (modelo.toLowerCase()) {
            case "auto"      -> new Auto(categoria);
            case "bicicleta" -> new Bicicleta(categoria);
            case "moto"      -> new Moto(categoria);
            default -> throw new IllegalArgumentException("Modelo no valido: " + modelo);
        };
    }
}

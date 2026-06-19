package edu.dosw.bootcamp.lab.comportamiento.reto7;

public class ComandoPersianas implements Comando {
    private final String accion;
    private final int porcentaje;

    public ComandoPersianas(String accion, int porcentaje) {
        this.accion = accion;
        this.porcentaje = porcentaje;
    }

    @Override
    public void ejecutar() {
        System.out.println(accion.equalsIgnoreCase("subir")
                ? "Persianas subidas al " + porcentaje + "%"
                : "Persianas bajadas al " + porcentaje + "%");
    }

    @Override
    public void deshacer() {
        System.out.println(accion.equalsIgnoreCase("subir")
                ? "Accion deshecha: Persianas vuelven a bajar."
                : "Accion deshecha: Persianas vuelven a subir.");
    }

    @Override
    public String getDescripcion() { return "Persianas " + accion + "(" + porcentaje + "%)"; }
}

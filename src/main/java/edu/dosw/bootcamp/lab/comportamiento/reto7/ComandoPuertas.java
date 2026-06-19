package edu.dosw.bootcamp.lab.comportamiento.reto7;

public class ComandoPuertas implements Comando {
    private final String accion;

    public ComandoPuertas(String accion) {
        this.accion = accion;
    }

    @Override
    public void ejecutar() {
        System.out.println(accion.equalsIgnoreCase("abrir") ? "Puerta abierta" : "Puerta cerrada");
    }

    @Override
    public void deshacer() {
        System.out.println(accion.equalsIgnoreCase("abrir")
                ? "Accion deshecha: Puerta cerrada."
                : "Accion deshecha: Puerta abierta.");
    }

    @Override
    public String getDescripcion() { return "Puertas " + accion; }
}

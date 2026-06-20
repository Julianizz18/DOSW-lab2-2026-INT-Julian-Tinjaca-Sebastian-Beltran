package edu.dosw.bootcamp.lab.comportamiento.reto7;

public class ComandoLuces implements Comando {
    private final String accion;
    private final int intensidad;

    public ComandoLuces(String accion, int intensidad) {
        this.accion = accion;
        this.intensidad = intensidad;
    }

    @Override
    public void ejecutar() {
        if (accion.equalsIgnoreCase("encender")) {
            System.out.println("Luces encendidas al " + intensidad + "%");
        } else {
            System.out.println("Luces apagadas");
        }
    }

    @Override
    public void deshacer() {
        if (accion.equalsIgnoreCase("encender")) {
            System.out.println("Accion deshecha: Luces apagadas.");
        } else {
            System.out.println("Accion deshecha: Luces encendidas.");
        }
    }

    @Override
    public String getDescripcion() {
        return accion.equalsIgnoreCase("encender")
                ? "Luces Encender(" + intensidad + "%)"
                : "Luces Apagar";
    }
}

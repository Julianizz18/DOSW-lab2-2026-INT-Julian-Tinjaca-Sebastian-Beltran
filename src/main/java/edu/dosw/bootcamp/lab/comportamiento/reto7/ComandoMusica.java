package edu.dosw.bootcamp.lab.comportamiento.reto7;

public class ComandoMusica implements Comando {
    private final String accion;
    private final int volumen;

    public ComandoMusica(String accion, int volumen) {
        this.accion = accion;
        this.volumen = volumen;
    }

    @Override
    public void ejecutar() {
        if (accion.equalsIgnoreCase("reproducir") || accion.equalsIgnoreCase("play")) {
            System.out.println("Musica en Play, vol: " + volumen);
        } else {
            System.out.println("Musica detenida");
        }
    }

    @Override
    public void deshacer() {
        if (accion.equalsIgnoreCase("reproducir") || accion.equalsIgnoreCase("play")) {
            System.out.println("Accion deshecha: Musica detenida.");
        } else {
            System.out.println("Accion deshecha: Musica en Play.");
        }
    }

    @Override
    public String getDescripcion() {
        return (accion.equalsIgnoreCase("reproducir") || accion.equalsIgnoreCase("play"))
                ? "Musica Play(" + volumen + ")"
                : "Musica Stop";
    }
}

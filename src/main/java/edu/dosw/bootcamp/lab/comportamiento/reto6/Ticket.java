package edu.dosw.bootcamp.lab.comportamiento.reto6;

public class Ticket {
    private final String descripcion;
    private final String nivel;
    private final String prioridad;
    private boolean resuelto = false;
    private String resolvedBy = null;

    public Ticket(String descripcion, String nivel, String prioridad) {
        this.descripcion = descripcion;
        this.nivel = nivel.toLowerCase();
        this.prioridad = prioridad.toLowerCase();
    }

    public String getDescripcion() { return descripcion; }
    public String getNivel() { return nivel; }
    public String getPrioridad() { return prioridad; }
    public boolean isResuelto() { return resuelto; }
    public String getResolvedBy() { return resolvedBy; }

    public void resolver(String tecnico) {
        this.resuelto = true;
        this.resolvedBy = tecnico;
    }

    public int getPrioridadValor() {
        return switch (prioridad) {
            case "baja"  -> 1;
            case "media" -> 2;
            case "alta"  -> 3;
            default      -> 0;
        };
    }
}

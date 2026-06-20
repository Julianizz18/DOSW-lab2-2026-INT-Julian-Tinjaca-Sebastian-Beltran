package edu.dosw.bootcamp.lab.comportamiento.reto6;

public abstract class Tecnico {
    protected Tecnico siguiente;

    public Tecnico setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public abstract void manejar(Ticket ticket, StringBuilder ruta);
}

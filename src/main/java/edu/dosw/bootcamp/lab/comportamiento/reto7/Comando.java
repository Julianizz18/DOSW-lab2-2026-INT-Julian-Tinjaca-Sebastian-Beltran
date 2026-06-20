package edu.dosw.bootcamp.lab.comportamiento.reto7;

public interface Comando {
    void ejecutar();
    void deshacer();
    String getDescripcion();
}

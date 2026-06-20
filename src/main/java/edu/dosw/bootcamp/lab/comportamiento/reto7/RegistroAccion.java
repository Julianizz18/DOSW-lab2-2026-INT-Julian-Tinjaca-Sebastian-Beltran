package edu.dosw.bootcamp.lab.comportamiento.reto7;

public class RegistroAccion {
    private final Comando comando;
    private final String usuario;
    private boolean deshecho = false;

    public RegistroAccion(Comando comando, String usuario) {
        this.comando = comando;
        this.usuario = usuario;
    }

    public Comando getComando() { return comando; }
    public String getUsuario() { return usuario; }
    public boolean isDeshecho() { return deshecho; }
    public void setDeshecho(boolean deshecho) { this.deshecho = deshecho; }
}

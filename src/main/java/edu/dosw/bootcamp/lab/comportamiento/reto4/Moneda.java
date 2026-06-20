package edu.dosw.bootcamp.lab.comportamiento.reto4;

public class Moneda {
    private String codigo;
    private String simbolo;
    private double monto;

    public Moneda(String codigo, String simbolo, double monto) {
        this.codigo = codigo;
        this.simbolo = simbolo;
        this.monto = monto;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public double getMonto() {
        return monto;
    }
}
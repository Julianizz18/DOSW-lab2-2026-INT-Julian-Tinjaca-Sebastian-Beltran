package edu.dosw.bootcamp.lab.solid.reto2;

import java.util.ArrayList;
import java.util.List;

public class HamburguesaBuilder {
    private String pan;
    private String carne;
    private String queso;
    private List<String> vegetales = new ArrayList<>();
    private String salsa;
    private double total;

    public HamburguesaBuilder setPan(String pan, double precio) {
        this.pan = pan;
        this.total += precio;
        return this;
    }
    public HamburguesaBuilder setCarne(String carne, double precio) {
        this.carne = carne;
        this.total += precio;
        return this;
    }
    public HamburguesaBuilder setQueso(String queso, double precio) {
        this.queso = queso;
        this.total += precio;
        return this;
    }
    public HamburguesaBuilder addVegetal(String vegetal, double precio) {
        this.vegetales.add(vegetal);
        this.total += precio;
        return this;
    }
    public HamburguesaBuilder setSalsa(String salsa, double precio) {
        this.salsa = salsa;
        this.total += precio;
        return this;
    }
    public Hamburguesa build() {
        return new Hamburguesa(pan, carne, queso, vegetales, salsa, total);
    }
}
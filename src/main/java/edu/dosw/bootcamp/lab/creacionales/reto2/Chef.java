package edu.dosw.bootcamp.lab.creacionales.reto2;

public class Chef {
    private final HamburguesaBuilder builder;

    public Chef(HamburguesaBuilder builder) {

        this.builder = builder;
    }
    public Hamburguesa prepararHamburguesa() {

        return builder.build();
    }
}
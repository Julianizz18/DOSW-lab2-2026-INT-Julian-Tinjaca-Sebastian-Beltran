package edu.dosw.bootcamp.lab.estructurales.reto5;

public abstract class CafeDecorator implements Cafe {
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }
}
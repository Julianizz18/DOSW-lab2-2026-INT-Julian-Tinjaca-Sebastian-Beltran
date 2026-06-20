package edu.dosw.bootcamp.lab.estructurales.reto5;

public class ChantillyDecorator extends CafeDecorator {

    public ChantillyDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + Chantilly";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 15000;
    }
}
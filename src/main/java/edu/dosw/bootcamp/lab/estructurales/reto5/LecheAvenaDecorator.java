package edu.dosw.bootcamp.lab.estructurales.reto5;

public class LecheAvenaDecorator extends CafeDecorator {

    public LecheAvenaDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + Leche de avena";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 2000;
    }
}
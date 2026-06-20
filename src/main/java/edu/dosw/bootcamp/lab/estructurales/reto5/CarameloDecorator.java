package edu.dosw.bootcamp.lab.estructurales.reto5;

public class CarameloDecorator extends CafeDecorator {

    public CarameloDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + Caramelo";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 23800;
    }
}
package edu.dosw.bootcamp.lab.creacionales.reto2;

import java.util.List;

public class Hamburguesa {
    private final String pan;
    private final String carne;
    private final String queso;
    private final List<String> vegetales;
    private final String salsa;
    private final double total;

    public Hamburguesa(String pan, String carne, String queso, List<String> vegetales, String salsa, double total) {
        this.pan = pan;
        this.carne = carne;
        this.queso = queso;
        this.vegetales = vegetales;
        this.salsa = salsa;
        this.total = total;
    }
    public void mostrar() {
        System.out.println("Tu Hamburguesa");
        System.out.println("Pan:      " + pan);
        System.out.println("Carne:    " + carne);
        System.out.println("Queso:    " + queso);
        System.out.println("Vegetales: " + String.join(", ", vegetales));
        System.out.println("Salsa:    " + salsa);
        System.out.println("Total:    $" + (int)total);
        System.out.println("¡Buen provecho!");
    }
}